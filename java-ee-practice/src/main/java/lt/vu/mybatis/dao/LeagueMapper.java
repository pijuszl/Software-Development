package lt.vu.mybatis.dao;

import lt.vu.mybatis.model.League;

import java.util.List;

public interface LeagueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LEAGUE
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LEAGUE
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    int insert(League record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LEAGUE
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    League selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LEAGUE
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    List<League> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.LEAGUE
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    int updateByPrimaryKey(League record);
}