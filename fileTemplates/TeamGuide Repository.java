#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end

import com.teamguide.api.core.GenericRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ${Entity}Repository extends GenericRepository<${Entity}> {


}
