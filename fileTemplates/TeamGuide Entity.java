#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.teamguide.api.core.Entity;
import lombok.Builder;
import lombok.Value;
import lombok.With;
import org.springframework.data.annotation.Id;

@Value
@Builder(toBuilder = true)
@With
public class ${Entity} implements Entity {
    @Id
    Long id;
}
