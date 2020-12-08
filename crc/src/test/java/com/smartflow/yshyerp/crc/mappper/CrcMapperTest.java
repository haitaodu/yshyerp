package com.smartflow.yshyerp.crc.mappper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.smartflow.yshyerp.crc.entity.Crc;
import com.smartflow.yshyerp.crc.entity.CrcExample;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author ：tao
 * @date ：Created in 2020/11/24 17:42
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Log4j2
public class CrcMapperTest {

    @Autowired
    CrcMapper crcMapper;


    @Test
    public void get()
    {
        CrcExample crcExample=new CrcExample();
        crcExample.setDistinct(true);
        CrcExample.Criteria criteria=crcExample.createCriteria();
        criteria.andActualBetween
                (BigDecimal.valueOf(400),BigDecimal.valueOf(600));
        List<Crc> crcs=crcMapper.selectByExample(crcExample);
        PageHelper.startPage(1,10);
        PageInfo<Crc> pageInfo=new PageInfo<>(crcs);
        log.info(pageInfo);
    }




}