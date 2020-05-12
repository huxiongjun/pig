package com.vsofo;

import com.vsofo.inventory.mapper.InventoryMapper;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author huxiongjun
 * @version 1.0
 * @date 2020/5/9 20:26
 * @description 测试
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MyTest {
    @Autowired
    private InventoryMapper inventoryMapper;

}
