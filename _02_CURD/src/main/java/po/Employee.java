package po;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/22 - 15:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
//已经配置类全局表名前缀
//@TableName("tbl_employee")
public class Employee {

    @TableId(type = IdType.AUTO)
    private Integer id ;
    private String lastName;
    private String email ;
    private Integer gender ;
    private Integer age ;

    @TableField(exist = false)
    private String address;

    public Employee(String lastName, String email, Integer gender, Integer age) {
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String lastName, String email, Integer age) {
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }
}
