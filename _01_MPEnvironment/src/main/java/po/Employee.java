package po;

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
public class Employee {
    private Integer id ;
    private String lastName;
    private String email ;
    private Integer gender ;
    private Integer age ;
}
