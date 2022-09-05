package space.eliseev.iplatformmoex.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.model.entity.*;
import space.eliseev.iplatformmoex.repository.*;
import space.eliseev.iplatformmoex.service.MetadataService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetadataServiceImpl implements MetadataService {
    private final BoardGroupMetadataRepository boardGroupMetadataRepository;
    private final BoardMetadataRepository boardMetadataRepository;
    private final DurationMetadataRepository durationMetadataRepository;
    private final EngineMetadataRepository engineMetadataRepository;
    private final MarketMetadataRepository marketMetadataRepository;
    private final SecurityCollectionMetadataRepository securityCollectionMetadataRepository;
    private final SecurityGroupMetadataRepository securityGroupMetadataRepository;
    private final SecurityTypeMetadataRepository securityTypeMetadataRepository;

    @Override
    public List<BoardGroup> getBoardGroup() {
        return boardGroupMetadataRepository.findAll();
    }

    @Override
    public List<Board> getBoard() {
        return boardMetadataRepository.findAll();
    }

    @Override
    public List<Duration> getDuration() {
        return durationMetadataRepository.findAll();
    }

    @Override
    public List<Engine> getEngine() {
        return engineMetadataRepository.findAll();
    }

    @Override
    public List<Market> getMarket() {
        return marketMetadataRepository.findAll();
    }

    @Override
    public List<SecurityCollection> getSecurityCollection() {
        return securityCollectionMetadataRepository.findAll();
    }

    @Override
    public List<SecurityGroup> getSecurityGroup() {
        return securityGroupMetadataRepository.findAll();
    }

    @Override
    public List<SecurityType> getSecurityType() {
        return securityTypeMetadataRepository.findAll();
    }
}
