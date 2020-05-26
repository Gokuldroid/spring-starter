package lily.potter.example.pojo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class TodoLombok {
    @Getter
    @Setter
    int id;

    String title;
    String description;
}
