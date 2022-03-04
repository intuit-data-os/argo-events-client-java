/*
 * Argo Events
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.6.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.events.models.eventsource;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.argoproj.events.models.eventsource.EventSourceFilter;
import io.argoproj.events.models.eventsource.GithubAppCreds;
import io.argoproj.events.models.eventsource.OwnedRepositories;
import io.argoproj.events.models.eventsource.WebhookContext;
import io.kubernetes.client.openapi.models.V1SecretKeySelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GithubEventSource refers to event-source for github related events
 */
@ApiModel(description = "GithubEventSource refers to event-source for github related events")

public class GithubEventSource {
  public static final String SERIALIZED_NAME_INSECURE = "insecure";
  @SerializedName(SERIALIZED_NAME_INSECURE)
  private Boolean insecure;

  public static final String SERIALIZED_NAME_ORGANIZATIONS = "organizations";
  @SerializedName(SERIALIZED_NAME_ORGANIZATIONS)
  private List<String> organizations = null;

  public static final String SERIALIZED_NAME_CONTENT_TYPE = "contentType";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private String contentType;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private String repository;

  public static final String SERIALIZED_NAME_GITHUB_UPLOAD_U_R_L = "githubUploadURL";
  @SerializedName(SERIALIZED_NAME_GITHUB_UPLOAD_U_R_L)
  private String githubUploadURL;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private WebhookContext webhook;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_REPOSITORIES = "repositories";
  @SerializedName(SERIALIZED_NAME_REPOSITORIES)
  private List<OwnedRepositories> repositories = null;

  public static final String SERIALIZED_NAME_API_TOKEN = "apiToken";
  @SerializedName(SERIALIZED_NAME_API_TOKEN)
  private V1SecretKeySelector apiToken = null;

  public static final String SERIALIZED_NAME_FILTER = "filter";
  @SerializedName(SERIALIZED_NAME_FILTER)
  private EventSourceFilter filter;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private String owner;

  public static final String SERIALIZED_NAME_GITHUB_BASE_U_R_L = "githubBaseURL";
  @SerializedName(SERIALIZED_NAME_GITHUB_BASE_U_R_L)
  private String githubBaseURL;

  public static final String SERIALIZED_NAME_GITHUB_APP = "githubApp";
  @SerializedName(SERIALIZED_NAME_GITHUB_APP)
  private GithubAppCreds githubApp;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_DELETE_HOOK_ON_FINISH = "deleteHookOnFinish";
  @SerializedName(SERIALIZED_NAME_DELETE_HOOK_ON_FINISH)
  private Boolean deleteHookOnFinish;

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private List<String> events = new ArrayList<String>();

  public static final String SERIALIZED_NAME_WEBHOOK_SECRET = "webhookSecret";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_SECRET)
  private V1SecretKeySelector webhookSecret = null;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public GithubEventSource insecure(Boolean insecure) {
    
    this.insecure = insecure;
    return this;
  }

   /**
   * Insecure tls verification
   * @return insecure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Insecure tls verification")

  public Boolean getInsecure() {
    return insecure;
  }


  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }


  public GithubEventSource organizations(List<String> organizations) {
    
    this.organizations = organizations;
    return this;
  }

  public GithubEventSource addOrganizationsItem(String organizationsItem) {
    if (this.organizations == null) {
      this.organizations = new ArrayList<String>();
    }
    this.organizations.add(organizationsItem);
    return this;
  }

   /**
   * Organizations holds the names of organizations (used for organization level webhooks). Not required if Repositories is set.
   * @return organizations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Organizations holds the names of organizations (used for organization level webhooks). Not required if Repositories is set.")

  public List<String> getOrganizations() {
    return organizations;
  }


  public void setOrganizations(List<String> organizations) {
    this.organizations = organizations;
  }


  public GithubEventSource contentType(String contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * ContentType of the event delivery
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ContentType of the event delivery")

  public String getContentType() {
    return contentType;
  }


  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public GithubEventSource repository(String repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * DeprecatedRepository refers to GitHub repo name i.e. argo-events Deprecated: use Repositories instead. Will be unsupported in v 1.6
   * @return repository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeprecatedRepository refers to GitHub repo name i.e. argo-events Deprecated: use Repositories instead. Will be unsupported in v 1.6")

  public String getRepository() {
    return repository;
  }


  public void setRepository(String repository) {
    this.repository = repository;
  }


  public GithubEventSource githubUploadURL(String githubUploadURL) {
    
    this.githubUploadURL = githubUploadURL;
    return this;
  }

   /**
   * GitHub upload URL (for GitHub Enterprise)
   * @return githubUploadURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GitHub upload URL (for GitHub Enterprise)")

  public String getGithubUploadURL() {
    return githubUploadURL;
  }


  public void setGithubUploadURL(String githubUploadURL) {
    this.githubUploadURL = githubUploadURL;
  }


  public GithubEventSource webhook(WebhookContext webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WebhookContext getWebhook() {
    return webhook;
  }


  public void setWebhook(WebhookContext webhook) {
    this.webhook = webhook;
  }


  public GithubEventSource id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id is the webhook&#39;s id Deprecated: This is not used at all, will be removed in v1.6
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id is the webhook's id Deprecated: This is not used at all, will be removed in v1.6")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GithubEventSource repositories(List<OwnedRepositories> repositories) {
    
    this.repositories = repositories;
    return this;
  }

  public GithubEventSource addRepositoriesItem(OwnedRepositories repositoriesItem) {
    if (this.repositories == null) {
      this.repositories = new ArrayList<OwnedRepositories>();
    }
    this.repositories.add(repositoriesItem);
    return this;
  }

   /**
   * Repositories holds the information of repositories, which uses repo owner as the key, and list of repo names as the value. Not required if Organizations is set.
   * @return repositories
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Repositories holds the information of repositories, which uses repo owner as the key, and list of repo names as the value. Not required if Organizations is set.")

  public List<OwnedRepositories> getRepositories() {
    return repositories;
  }


  public void setRepositories(List<OwnedRepositories> repositories) {
    this.repositories = repositories;
  }


  public GithubEventSource apiToken(V1SecretKeySelector apiToken) {
    
    this.apiToken = apiToken;
    return this;
  }

   /**
   * Get apiToken
   * @return apiToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getApiToken() {
    return apiToken;
  }


  public void setApiToken(V1SecretKeySelector apiToken) {
    this.apiToken = apiToken;
  }


  public GithubEventSource filter(EventSourceFilter filter) {
    
    this.filter = filter;
    return this;
  }

   /**
   * Get filter
   * @return filter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EventSourceFilter getFilter() {
    return filter;
  }


  public void setFilter(EventSourceFilter filter) {
    this.filter = filter;
  }


  public GithubEventSource owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * DeprecatedOwner refers to GitHub owner name i.e. argoproj Deprecated: use Repositories instead. Will be unsupported in v 1.6
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeprecatedOwner refers to GitHub owner name i.e. argoproj Deprecated: use Repositories instead. Will be unsupported in v 1.6")

  public String getOwner() {
    return owner;
  }


  public void setOwner(String owner) {
    this.owner = owner;
  }


  public GithubEventSource githubBaseURL(String githubBaseURL) {
    
    this.githubBaseURL = githubBaseURL;
    return this;
  }

   /**
   * GitHub base URL (for GitHub Enterprise)
   * @return githubBaseURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "GitHub base URL (for GitHub Enterprise)")

  public String getGithubBaseURL() {
    return githubBaseURL;
  }


  public void setGithubBaseURL(String githubBaseURL) {
    this.githubBaseURL = githubBaseURL;
  }


  public GithubEventSource githubApp(GithubAppCreds githubApp) {
    
    this.githubApp = githubApp;
    return this;
  }

   /**
   * Get githubApp
   * @return githubApp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GithubAppCreds getGithubApp() {
    return githubApp;
  }


  public void setGithubApp(GithubAppCreds githubApp) {
    this.githubApp = githubApp;
  }


  public GithubEventSource active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Active refers to status of the webhook for event deliveries. https://developer.github.com/webhooks/creating/#active
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Active refers to status of the webhook for event deliveries. https://developer.github.com/webhooks/creating/#active")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public GithubEventSource deleteHookOnFinish(Boolean deleteHookOnFinish) {
    
    this.deleteHookOnFinish = deleteHookOnFinish;
    return this;
  }

   /**
   * DeleteHookOnFinish determines whether to delete the GitHub hook for the repository once the event source is stopped.
   * @return deleteHookOnFinish
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeleteHookOnFinish determines whether to delete the GitHub hook for the repository once the event source is stopped.")

  public Boolean getDeleteHookOnFinish() {
    return deleteHookOnFinish;
  }


  public void setDeleteHookOnFinish(Boolean deleteHookOnFinish) {
    this.deleteHookOnFinish = deleteHookOnFinish;
  }


  public GithubEventSource events(List<String> events) {
    
    this.events = events;
    return this;
  }

  public GithubEventSource addEventsItem(String eventsItem) {
    this.events.add(eventsItem);
    return this;
  }

   /**
   * Events refer to Github events to which the event source will subscribe
   * @return events
  **/
  @ApiModelProperty(required = true, value = "Events refer to Github events to which the event source will subscribe")

  public List<String> getEvents() {
    return events;
  }


  public void setEvents(List<String> events) {
    this.events = events;
  }


  public GithubEventSource webhookSecret(V1SecretKeySelector webhookSecret) {
    
    this.webhookSecret = webhookSecret;
    return this;
  }

   /**
   * Get webhookSecret
   * @return webhookSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1SecretKeySelector getWebhookSecret() {
    return webhookSecret;
  }


  public void setWebhookSecret(V1SecretKeySelector webhookSecret) {
    this.webhookSecret = webhookSecret;
  }


  public GithubEventSource metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public GithubEventSource putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<String, String>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Metadata holds the user defined metadata which will passed along the event payload.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata holds the user defined metadata which will passed along the event payload.")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GithubEventSource githubEventSource = (GithubEventSource) o;
    return Objects.equals(this.insecure, githubEventSource.insecure) &&
        Objects.equals(this.organizations, githubEventSource.organizations) &&
        Objects.equals(this.contentType, githubEventSource.contentType) &&
        Objects.equals(this.repository, githubEventSource.repository) &&
        Objects.equals(this.githubUploadURL, githubEventSource.githubUploadURL) &&
        Objects.equals(this.webhook, githubEventSource.webhook) &&
        Objects.equals(this.id, githubEventSource.id) &&
        Objects.equals(this.repositories, githubEventSource.repositories) &&
        Objects.equals(this.apiToken, githubEventSource.apiToken) &&
        Objects.equals(this.filter, githubEventSource.filter) &&
        Objects.equals(this.owner, githubEventSource.owner) &&
        Objects.equals(this.githubBaseURL, githubEventSource.githubBaseURL) &&
        Objects.equals(this.githubApp, githubEventSource.githubApp) &&
        Objects.equals(this.active, githubEventSource.active) &&
        Objects.equals(this.deleteHookOnFinish, githubEventSource.deleteHookOnFinish) &&
        Objects.equals(this.events, githubEventSource.events) &&
        Objects.equals(this.webhookSecret, githubEventSource.webhookSecret) &&
        Objects.equals(this.metadata, githubEventSource.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(insecure, organizations, contentType, repository, githubUploadURL, webhook, id, repositories, apiToken, filter, owner, githubBaseURL, githubApp, active, deleteHookOnFinish, events, webhookSecret, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GithubEventSource {\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    organizations: ").append(toIndentedString(organizations)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
    sb.append("    githubUploadURL: ").append(toIndentedString(githubUploadURL)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repositories: ").append(toIndentedString(repositories)).append("\n");
    sb.append("    apiToken: ").append(toIndentedString(apiToken)).append("\n");
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    githubBaseURL: ").append(toIndentedString(githubBaseURL)).append("\n");
    sb.append("    githubApp: ").append(toIndentedString(githubApp)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    deleteHookOnFinish: ").append(toIndentedString(deleteHookOnFinish)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

