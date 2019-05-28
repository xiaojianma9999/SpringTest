package com.xiaojianma.test.common;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml"})//用于加载bean

/**
 * 方法一：@ContextConfiguration(classes = {App.class});
 * 方法二：@ContextConfiguration(locations = {"classpath*:/spring/applicationContext.xml"})
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext.xml"})
public abstract  class ComTest {
}
