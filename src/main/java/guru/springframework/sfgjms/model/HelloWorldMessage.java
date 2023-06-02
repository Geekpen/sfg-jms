package guru.springframework.sfgjms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NotNull
public class HelloWorldMessage implements Serializable {
    static final long serialVersionUID = -16249581798460415L;
    private UUID id;
    private String message;
}
