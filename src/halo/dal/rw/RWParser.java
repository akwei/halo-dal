package halo.dal.rw;

import halo.dal.analysis.SQLInfo;

public interface RWParser {

    String parseDsKey(String tableLogicName, SQLInfo sqlInfo,
            ConnectionStatus connectionStatus);
}
