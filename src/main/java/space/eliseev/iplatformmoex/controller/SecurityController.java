package space.eliseev.iplatformmoex.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import space.eliseev.iplatformmoex.model.enumeration.Engine;
import space.eliseev.iplatformmoex.model.enumeration.Market;
import space.eliseev.iplatformmoex.service.SecurityService;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/security", produces = "application/json; charset=UTF-8")
@Tag(name = "Security API", description = "Сервис получения ценных бумаг")

public class SecurityController {

    private final SecurityService securityService;

    @Operation(
            summary = "Get all Securities",
            description = "Получить список ценных бумаг",
            tags = "Security API"
    )
    @Parameter(description = "Выбор ценной бумаги по secid", required = false, name = "q")
    @Parameter(description = "Язык описания", required = false, name = "lang")
    @Parameter(description = "Выбор торговой системы", required = false, name = "engine")
    @Parameter(description = "Фильтр участия бумаги в торгах", required = false, name = "is_trading")
    @Parameter(description = "Выбор рынка", required = false ,name = "market")
    @Parameter(description = "Группировка списка", required = false, name = "group_by")
    @Parameter(description = "Ограничения длины списка", required = false, name = "limit")
    @Parameter(description = "Фильтрация выходного списка", required = false, name = "group_by_filter")
    @Parameter(description = "Выбор стартовой строки вывода", required = false, name = "start")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(mediaType = "application/json"),
                    description = "Successful operation")
    })
    @GetMapping("/getSecurities")
    public ResponseEntity<Object> getSecurities(
            @RequestParam(value = "q", required = false) String q,
            @RequestParam(value = "lang", defaultValue = "ru", required = false) String lang,
            @RequestParam(value = "engine", required = false) Engine engine,
            @RequestParam(value = "is_trading", required = false) Integer isTrading,
            @RequestParam(value = "market", required = false) Market market,
            @RequestParam(value = "group_by", required = false) String groupBy,
            @RequestParam(value = "limit", defaultValue = "100", required = false) String limit,
            @RequestParam(value = "group_by_filter", required = false) String groupByFilter,
            @RequestParam(value = "start", defaultValue = "0", required = false) Integer start) {

        return new ResponseEntity<>(securityService.getSecurities(q, lang,
                engine, isTrading, market, groupBy, limit, groupByFilter, start), HttpStatus.OK);
    }

    @Operation(
            summary = "Subtotals of the day",
            description = "Получить промежуточные итоги дня",
            tags = "Security API"
    )
    @Parameter(description = "Выбор торговой системы", required = true, name = "engine")
    @Parameter(description = "Выбор рынка", required = true ,name = "market")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(mediaType = "application/json"),
                    description = "Successful operation")
    })
    @GetMapping("/getSecStats")
    public ResponseEntity<Object> getSecStats(@RequestParam(name = "tradingsession", required = false) String tradingSession,
                                              @RequestParam(name = "securities", required = false) String securities,
                                              @RequestParam(name = "boardid", required = false) String boardId,
                                              @RequestParam(name = "engine") Engine engine,
                                              @RequestParam(name = "market") Market market) {
        return new ResponseEntity<>(securityService.getSecStats(tradingSession, securities, boardId, engine, market), HttpStatus.OK);
    }

    @Operation(
            summary = "Tool specification",
            description = "Получить спецификацию инструмента",
            tags = "Security API"
    )
    @Parameter(description = "seqid выбранной ценной бумаги", required = true, name = "security")
    @Parameter(description = "Язык описания", required = false, name = "lang")
    @Parameter(description = "Выбор стартовой строки вывода", required = false, name = "start")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(mediaType = "application/json"),
                    description = "Successful operation")
    })
    @GetMapping("/getSecurity")
    public ResponseEntity<Object> getSecurity(@RequestParam("security") String security,
                                                    @RequestParam(value = "lang", required = false) String lang,
                                                    @RequestParam(value = "start", required = false) Integer start) {

        return ResponseEntity.ok().body(securityService.getSecurity(security, lang, start));
    }

    @Operation(
            summary = "Aggregate totals",
            description = "Получить агрегированные итоги торгов за дату по рынкам",
            tags = "Security API"
    )
    @Parameter(description = "seqid выбранной ценной бумаги", required = true, name = "security")
    @Parameter(description = "Язык описания", required = false, name = "lang")
    @Parameter(description = "Выбор даты", required = false, name = "date")
    @ApiResponses(value = {
            @ApiResponse(
                    responseCode = "200",
                    content = @Content(mediaType = "application/json"),
                    description = "Successful operation")
    })
    @GetMapping(value = "/security/aggregates", produces = "application/json; charset=UTF-8")
    public ResponseEntity<Object> getSecurityAggregates(
            @RequestParam(value = "security") String security,
            @RequestParam(value = "lang",defaultValue = "ru") String lang,
            @RequestParam(value = "date", defaultValue = "last") String date) {

        return new ResponseEntity<>(securityService.getSecurityAggregates(security, lang, date), HttpStatus.OK);
    }

}
