package context;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注释 6.3 BeanFactory 后处理器的 demo
 * @author JingQ at 2019-06-14
 */
public class BeanFactoryPostProcessorBootstrap {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("factory.bean/factory-post-processor.xml");
		// 硬编码 后处理器执行时间
		// 因为BeanFactoryPostProcessor存储在context中,而context在refresh的时候会销毁之前所有Bean以及BeanFactory
		// 因此不会销毁BeanFactoryPostProcessor
		BeanFactoryPostProcessor hardCodeBeanFactoryPostProcessor = new CarBeanFactoryPostProcessor();
		context.addBeanFactoryPostProcessor(hardCodeBeanFactoryPostProcessor);
		// 更新上下文
		context.refresh();
		// 输出：
		// Hard Code BeanFactory Post Processor execute time
		// Car{maxSpeed=0, brand='*****', price=10000.0}
		System.out.println(context.getBean("car"));
	}
}
