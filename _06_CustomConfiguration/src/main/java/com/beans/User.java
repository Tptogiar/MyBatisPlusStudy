package com.beans;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableLogic;
import com.baomidou.mybatisplus.enums.FieldFill;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 17:31
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Integer id;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String lastName;
    @TableLogic
    private Integer logicFlag;

}
