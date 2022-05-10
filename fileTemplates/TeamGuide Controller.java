#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.teamguide.api.security.CurrentAccountService;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("${path}")
@RequiredArgsConstructor
public class ${Entity}Controller {

    private final ${Entity}Service service;
    
    private final CurrentAccountService currentUser;

}