package space.eliseev.iplatformmoex.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Markets {
    SHARES("shares"),
    BONDS("bonds"),
    REPO("repo"),
    NDM("ndm"),
    INDEX("index"),
    SELT("selt"),
    MAIN("main"),
    FUTURES("futures"),
    GRAIN("grain"),
    FORTS("forts"),
    STANDARD("standard"),
    OPTIONS("options"),
    CLASSICA("classica"),
    CCP("ccp"),
    QNV("qnv"),
    OTC("otc"),
    MOEXBOARD("moexboard"),
    DEPOSIT("deposit"),
    MAMC("mamc"),
    FORTSIQS("fortsiqs"),
    OPTIONSIQS("optionsiqs"),
    GCC("gcc"),
    FOREIGNSHARES("foreignshares"),
    FOREIGNNDM("foreignndm"),
    SUGAR("sugar"),
    CREDIT("credit"),
    NONRESNDM("nonresndm"),
    NONRESREPO("nonresrepo"),
    NONRESCCP("nonresccp"),
    BUYAUCTIONS("buyauctions");

    private final String name;
}
