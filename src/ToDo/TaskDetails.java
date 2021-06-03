package ToDo;

public class TaskDetails {
    private int ID;
    private String title;
    private String description;
    private String status;

    public TaskDetails(int taskID,String title, String description, String status) {
        this.ID = taskID;
        this.title = title;
        this.description = description;
        this.status = status;

    }

    public int getID() {
        return ID;
    }



    public String getTitle() {
        return title;
    }


    public String getDescription() {
        return description;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isInProgress() {
        if("In process".equalsIgnoreCase(getStatus())){
            return true;
        }else {
            return false;
        }
    }


    public boolean isCompleted() {
        if("Completed".equalsIgnoreCase(getStatus())){
            return true;
        }else {
            return false;
        }
    }

    public boolean isTODO() {
        if("TODO".equalsIgnoreCase(getStatus())){
            return true;
        }else {
            return false;
        }
    }
}
