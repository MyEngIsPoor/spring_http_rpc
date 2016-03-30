package auto.test.http.spring.model;



public class ProcessTest {
    private Integer id;

    private String beforeId;

    private String contentId;

    private String clearId;

    private String testType;

    private String isRegress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBeforeId() {
        return beforeId;
    }

    public void setBeforeId(String beforeId) {
        this.beforeId = beforeId == null ? null : beforeId.trim();
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId == null ? null : contentId.trim();
    }

    public String getClearId() {
        return clearId;
    }

    public void setClearId(String clearId) {
        this.clearId = clearId == null ? null : clearId.trim();
    }

    public String getTestType() {
        return testType;
    }

    public void setTestType(String testType) {
        this.testType = testType == null ? null : testType.trim();
    }

    public String getIsRegress() {
        return isRegress;
    }

    public void setIsRegress(String isRegress) {
        this.isRegress = isRegress == null ? null : isRegress.trim();
    }
}