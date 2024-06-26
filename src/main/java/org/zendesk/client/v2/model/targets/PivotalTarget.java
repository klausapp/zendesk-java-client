package org.zendesk.client.v2.model.targets;

import com.fasterxml.jackson.annotation.JsonProperty;

/** @author adavidson */
public class PivotalTarget extends Target {
  private String token;
  private String projectId;
  private String storyType;
  private String storyTitle;
  private String requestedBy;
  private String ownerBy;
  private String storyLabels;

  @Override
  public String getType() {
    return "pivotal_target";
  }

  @Override
  public String toString() {
    return "UrlTarget"
        + "{id="
        + getId()
        + ", title="
        + getTitle()
        + ", type="
        + getType()
        + ", active="
        + isActive()
        + ", createdAt="
        + getCreatedAt()
        + ", token="
        + token
        + ", projectId="
        + projectId
        + ", storyType="
        + storyType
        + ", storyTitle="
        + storyTitle
        + ", requestedBy="
        + requestedBy
        + ", ownerBy="
        + ownerBy
        + ", storyLabels="
        + storyLabels
        + '}';
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  @JsonProperty("project_id")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  @JsonProperty("story_type")
  public String getStoryType() {
    return storyType;
  }

  public void setStoryType(String storyType) {
    this.storyType = storyType;
  }

  @JsonProperty("story_title")
  public String getStoryTitle() {
    return storyTitle;
  }

  public void setStoryTitle(String storyTitle) {
    this.storyTitle = storyTitle;
  }

  @JsonProperty("requested_by")
  public String getRequestedBy() {
    return requestedBy;
  }

  public void setRequestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
  }

  @JsonProperty("owner_by")
  public String getOwnerBy() {
    return ownerBy;
  }

  public void setOwnerBy(String ownerBy) {
    this.ownerBy = ownerBy;
  }

  @JsonProperty("storey_labels")
  public String getStoryLabels() {
    return storyLabels;
  }

  public void setStoryLabels(String storyLabels) {
    this.storyLabels = storyLabels;
  }
}
