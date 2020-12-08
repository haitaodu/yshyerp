package com.smartflow.yshyerp.crc.controller;

import com.smartflow.yshyerp.crc.entity.Cell;
import com.smartflow.yshyerp.crc.service.CellService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：tao
 * @date ：Created in 2020/10/26 22:35
 * *@description：${description}
 *  * @modified By：
 *  * @version: version
 */
@Log4j2
@RestController
@RequestMapping("/Cell")
@Api(tags = "CellController", description = "岛区管理")
public class CellController {

    private final
    CellService cellService;

    @Autowired
    public CellController(CellService cellService) {
        this.cellService = cellService;
    }


    @ApiOperation("根据id查找岛区")
    @GetMapping("getCellById/{id}")
    public Cell getCellById(@PathVariable int id)
    {
     return cellService.getCell(id);
    }

}
