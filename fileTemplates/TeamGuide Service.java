#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.teamguide.api.core.GenericRepository;
import com.teamguide.api.core.GenericService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ${Entity}Service implements GenericService<${Entity}> {

    private final ${Entity}Repository repository;

    @Override
    public GenericRepository<$Entity> getRepository() {
        return repository;
    }

}
