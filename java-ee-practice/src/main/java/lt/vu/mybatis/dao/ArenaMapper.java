package lt.vu.mybatis.dao;

import lt.vu.mybatis.model.Arena;

import java.util.List;

public interface ArenaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ARENA
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ARENA
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    int insert(Arena record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ARENA
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    Arena selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ARENA
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    List<Arena> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ARENA
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    int updateByPrimaryKey(Arena record);
}