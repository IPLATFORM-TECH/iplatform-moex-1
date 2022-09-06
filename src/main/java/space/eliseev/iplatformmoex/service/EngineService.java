package space.eliseev.iplatformmoex.service;

public interface EngineService {

    Object getEngines(String lang);
    Object getEngine(String engine, String lang, String timetable, String meta);
}
