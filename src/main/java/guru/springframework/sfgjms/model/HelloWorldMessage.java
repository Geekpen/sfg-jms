package guru.springframework.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@NotNull
public class HelloWorldMessage implements Serializable {
    static final long serialVersionUID = -16249581798460415L;
    private UUID id;
    private String message;
}
