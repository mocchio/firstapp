package in.techcamp.firstapp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor
@Data
public class PostEntity {
    private long id;
    private String memo;
}
