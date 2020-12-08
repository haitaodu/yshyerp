package com.smartflow.yshyerp.crc.serviceImpl;

import com.smartflow.yshyerp.crc.dto.page.OutAndInQuantityPage;
import com.smartflow.yshyerp.crc.dto.search.searchOutAndInPage;
import com.smartflow.yshyerp.crc.entity.CrcExample;
import com.smartflow.yshyerp.crc.service.CrcService;
import com.sun.corba.se.spi.orb.ParserData;
import util.DateParse;

import java.text.ParseException;
import java.util.List;

/**
 * @author ：tao
 * @date ：Created in 2020/11/30 11:12
 * @description：${description}
 * @modified By：
 * @version: version
 */

public class CrcServiceImpl implements CrcService {
    @Override
    public List<OutAndInQuantityPage> getPages(searchOutAndInPage searchOutAndInPage) throws ParseException {
        CrcExample crcExample=new CrcExample();
        crcExample.setDistinct(true);
        CrcExample.Criteria criteria=crcExample.createCriteria();
        criteria.andDate1Between(DateParse.parse(searchOutAndInPage.getTimeBegin()),
                DateParse.parse(searchOutAndInPage.getTimeEnd()));
        criteria.andCCustomerEqualTo(searchOutAndInPage.getCoustomer());
        return null;
    }
}
