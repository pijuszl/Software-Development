package lt.vu.mybatis.dao;

import lt.vu.mybatis.model.TeamLeague;

import java.util.List;

public interface TeamLeagueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TEAM_LEAGUE
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    int insert(TeamLeague record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.TEAM_LEAGUE
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    List<TeamLeague> selectAll();
}