package space.eliseev.iplatformmoex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import space.eliseev.iplatformmoex.model.entity.SecurityGroup;

@Repository
public interface SecurityGroupMetadataRepository extends JpaRepository<SecurityGroup, String> {
}
