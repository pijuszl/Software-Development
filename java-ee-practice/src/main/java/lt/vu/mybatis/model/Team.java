package lt.vu.mybatis.model;

public class Team {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.TEAM.ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.TEAM.NAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.TEAM.HOMEARENA_ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    private Long homearenaId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.TEAM.ID
     *
     * @return the value of PUBLIC.TEAM.ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.TEAM.ID
     *
     * @param id the value for PUBLIC.TEAM.ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.TEAM.NAME
     *
     * @return the value of PUBLIC.TEAM.NAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.TEAM.NAME
     *
     * @param name the value for PUBLIC.TEAM.NAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.TEAM.HOMEARENA_ID
     *
     * @return the value of PUBLIC.TEAM.HOMEARENA_ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public Long getHomearenaId() {
        return homearenaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.TEAM.HOMEARENA_ID
     *
     * @param homearenaId the value for PUBLIC.TEAM.HOMEARENA_ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public void setHomearenaId(Long homearenaId) {
        this.homearenaId = homearenaId;
    }
}