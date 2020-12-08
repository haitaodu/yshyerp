package com.smartflow.yshyerp.crc.service;

import com.github.pagehelper.PageInfo;
import com.smartflow.yshyerp.crc.dto.page.OutAndInQuantityPage;
import com.smartflow.yshyerp.crc.dto.search.searchOutAndInPage;

import java.text.ParseException;
import java.util.List;

/**
 * @author ：tao
 * @date ：Created in 2020/11/24 17:42
 * @description：${description}
 * @modified By：
 * @version: version
 */

public interface CrcService {

    List<OutAndInQuantityPage> getPages(searchOutAndInPage searchOutAndInPage) throws ParseException;
}
