package lt.vu.mybatis.model;

public class League {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.LEAGUE.ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.LEAGUE.NAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.LEAGUE.SHORTNAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    private String shortname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.LEAGUE.ID
     *
     * @return the value of PUBLIC.LEAGUE.ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.LEAGUE.ID
     *
     * @param id the value for PUBLIC.LEAGUE.ID
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.LEAGUE.NAME
     *
     * @return the value of PUBLIC.LEAGUE.NAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.LEAGUE.NAME
     *
     * @param name the value for PUBLIC.LEAGUE.NAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.LEAGUE.SHORTNAME
     *
     * @return the value of PUBLIC.LEAGUE.SHORTNAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public String getShortname() {
        return shortname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.LEAGUE.SHORTNAME
     *
     * @param shortname the value for PUBLIC.LEAGUE.SHORTNAME
     *
     * @mbg.generated Tue Mar 26 21:26:35 EET 2024
     */
    public void setShortname(String shortname) {
        this.shortname = shortname;
    }
}