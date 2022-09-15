package org.springframework.context.annotation.mytest;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigApplicationContextTest {

	@Test
	public void testInvokeBeanFactoryPostProcessors() {
		new AnnotationConfigApplicationContext(BeanDefinitionRegistryPostProcessorTest.class,
				BeanFactoryPostProcessorTest.class);
	}

	@Test
	public void testRegisterBeanPostProcessors() {
		new AnnotationConfigApplicationContext(MyBeanPostProcessor.class);
	}
}
