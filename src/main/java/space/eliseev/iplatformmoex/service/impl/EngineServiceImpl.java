package space.eliseev.iplatformmoex.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import space.eliseev.iplatformmoex.client.EngineClient;
import space.eliseev.iplatformmoex.service.EngineService;

@Service
@RequiredArgsConstructor
public class EngineServiceImpl implements EngineService {

    private final EngineClient engineClient;

    @Override
    public Object getEngines(String lang) {
        return engineClient.getEngines(lang);
    }

    @Override
    public Object getEngine(String engine, String lang, String timetable, String meta) {
        return engineClient.getEngine(engine, lang, timetable, meta);
    }
}
