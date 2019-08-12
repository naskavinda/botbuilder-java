/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.connector;

import com.microsoft.bot.schema.models.Activity;
import com.microsoft.bot.schema.models.AttachmentData;
import com.microsoft.bot.schema.models.ChannelAccount;
import com.microsoft.bot.schema.models.ConversationParameters;
import com.microsoft.bot.schema.models.ConversationResourceResponse;
import com.microsoft.bot.schema.models.ConversationsResult;
import com.microsoft.bot.connector.models.ErrorResponseException;
import com.microsoft.bot.schema.models.ResourceResponse;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Conversations.
 */
public interface Conversations {
    /**
     * GetConversations.
     * List the Conversations in which this bot has participated.
     GET from this method with a skip token
     The return value is a ConversationsResult, which contains an array of ConversationMembers and a skip token.  If the skip token is not empty, then
     there are further values to be returned. Call this method again with the returned token to get more values.
     Each ConversationMembers object contains the ID of the conversation and an array of ChannelAccounts that describe the members of the conversation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConversationsResult object if successful.
     */
    ConversationsResult getConversations();

    /**
     * GetConversations.
     * List the Conversations in which this bot has participated.
     GET from this method with a skip token
     The return value is a ConversationsResult, which contains an array of ConversationMembers and a skip token.  If the skip token is not empty, then
     there are further values to be returned. Call this method again with the returned token to get more values.
     Each ConversationMembers object contains the ID of the conversation and an array of ChannelAccounts that describe the members of the conversation.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ConversationsResult> getConversationsAsync(final ServiceCallback<ConversationsResult> serviceCallback);

    /**
     * GetConversations.
     * List the Conversations in which this bot has participated.
     GET from this method with a skip token
     The return value is a ConversationsResult, which contains an array of ConversationMembers and a skip token.  If the skip token is not empty, then
     there are further values to be returned. Call this method again with the returned token to get more values.
     Each ConversationMembers object contains the ID of the conversation and an array of ChannelAccounts that describe the members of the conversation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConversationsResult object
     */
    Observable<ConversationsResult> getConversationsAsync();

    /**
     * GetConversations.
     * List the Conversations in which this bot has participated.
     GET from this method with a skip token
     The return value is a ConversationsResult, which contains an array of ConversationMembers and a skip token.  If the skip token is not empty, then
     there are further values to be returned. Call this method again with the returned token to get more values.
     Each ConversationMembers object contains the ID of the conversation and an array of ChannelAccounts that describe the members of the conversation.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConversationsResult object
     */
    Observable<ServiceResponse<ConversationsResult>> getConversationsWithServiceResponseAsync();
    /**
     * GetConversations.
     * List the Conversations in which this bot has participated.
     GET from this method with a skip token
     The return value is a ConversationsResult, which contains an array of ConversationMembers and a skip token.  If the skip token is not empty, then
     there are further values to be returned. Call this method again with the returned token to get more values.
     Each ConversationMembers object contains the ID of the conversation and an array of ChannelAccounts that describe the members of the conversation.
     *
     * @param continuationToken skip or continuation token
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConversationsResult object if successful.
     */
    ConversationsResult getConversations(String continuationToken);

    /**
     * GetConversations.
     * List the Conversations in which this bot has participated.
     GET from this method with a skip token
     The return value is a ConversationsResult, which contains an array of ConversationMembers and a skip token.  If the skip token is not empty, then
     there are further values to be returned. Call this method again with the returned token to get more values.
     Each ConversationMembers object contains the ID of the conversation and an array of ChannelAccounts that describe the members of the conversation.
     *
     * @param continuationToken skip or continuation token
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ConversationsResult> getConversationsAsync(String continuationToken, final ServiceCallback<ConversationsResult> serviceCallback);

    /**
     * GetConversations.
     * List the Conversations in which this bot has participated.
     GET from this method with a skip token
     The return value is a ConversationsResult, which contains an array of ConversationMembers and a skip token.  If the skip token is not empty, then
     there are further values to be returned. Call this method again with the returned token to get more values.
     Each ConversationMembers object contains the ID of the conversation and an array of ChannelAccounts that describe the members of the conversation.
     *
     * @param continuationToken skip or continuation token
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConversationsResult object
     */
    Observable<ConversationsResult> getConversationsAsync(String continuationToken);

    /**
     * GetConversations.
     * List the Conversations in which this bot has participated.
     GET from this method with a skip token
     The return value is a ConversationsResult, which contains an array of ConversationMembers and a skip token.  If the skip token is not empty, then
     there are further values to be returned. Call this method again with the returned token to get more values.
     Each ConversationMembers object contains the ID of the conversation and an array of ChannelAccounts that describe the members of the conversation.
     *
     * @param continuationToken skip or continuation token
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConversationsResult object
     */
    Observable<ServiceResponse<ConversationsResult>> getConversationsWithServiceResponseAsync(String continuationToken);

    /**
     * CreateConversation.
     * Create a new Conversation.
     POST to this method with a
     * Bot being the bot creating the conversation
     * IsGroup set to true if this is not a direct message (default is false)
     * Members array contining the members you want to have be in the conversation.
     The return value is a ResourceResponse which contains a conversation id which is suitable for use
     in the message payload and REST API uris.
     Most channels only support the semantics of bots initiating a direct message conversation.  An example of how to do that would be:
     ```
     var resource = await connector.conversations.CreateConversation(new ConversationParameters(){ Bot = bot, members = new ChannelAccount[] { new ChannelAccount("user1") } );
     await connect.Conversations.SendToConversationAsync(resource.Id, new Activity() ... ) ;
     ```.
     *
     * @param parameters Parameters to create the conversation from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConversationResourceResponse object if successful.
     */
    ConversationResourceResponse createConversation(ConversationParameters parameters);

    /**
     * CreateConversation.
     * Create a new Conversation.
     POST to this method with a
     * Bot being the bot creating the conversation
     * IsGroup set to true if this is not a direct message (default is false)
     * Members array contining the members you want to have be in the conversation.
     The return value is a ResourceResponse which contains a conversation id which is suitable for use
     in the message payload and REST API uris.
     Most channels only support the semantics of bots initiating a direct message conversation.  An example of how to do that would be:
     ```
     var resource = await connector.conversations.CreateConversation(new ConversationParameters(){ Bot = bot, members = new ChannelAccount[] { new ChannelAccount("user1") } );
     await connect.Conversations.SendToConversationAsync(resource.Id, new Activity() ... ) ;
     ```.
     *
     * @param parameters Parameters to create the conversation from
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ConversationResourceResponse> createConversationAsync(ConversationParameters parameters, final ServiceCallback<ConversationResourceResponse> serviceCallback);

    /**
     * CreateConversation.
     * Create a new Conversation.
     POST to this method with a
     * Bot being the bot creating the conversation
     * IsGroup set to true if this is not a direct message (default is false)
     * Members array contining the members you want to have be in the conversation.
     The return value is a ResourceResponse which contains a conversation id which is suitable for use
     in the message payload and REST API uris.
     Most channels only support the semantics of bots initiating a direct message conversation.  An example of how to do that would be:
     ```
     var resource = await connector.conversations.CreateConversation(new ConversationParameters(){ Bot = bot, members = new ChannelAccount[] { new ChannelAccount("user1") } );
     await connect.Conversations.SendToConversationAsync(resource.Id, new Activity() ... ) ;
     ```.
     *
     * @param parameters Parameters to create the conversation from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConversationResourceResponse object
     */
    Observable<ConversationResourceResponse> createConversationAsync(ConversationParameters parameters);

    /**
     * CreateConversation.
     * Create a new Conversation.
     POST to this method with a
     * Bot being the bot creating the conversation
     * IsGroup set to true if this is not a direct message (default is false)
     * Members array contining the members you want to have be in the conversation.
     The return value is a ResourceResponse which contains a conversation id which is suitable for use
     in the message payload and REST API uris.
     Most channels only support the semantics of bots initiating a direct message conversation.  An example of how to do that would be:
     ```
     var resource = await connector.conversations.CreateConversation(new ConversationParameters(){ Bot = bot, members = new ChannelAccount[] { new ChannelAccount("user1") } );
     await connect.Conversations.SendToConversationAsync(resource.Id, new Activity() ... ) ;
     ```.
     *
     * @param parameters Parameters to create the conversation from
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConversationResourceResponse object
     */
    Observable<ServiceResponse<ConversationResourceResponse>> createConversationWithServiceResponseAsync(ConversationParameters parameters);

    /**
     * SendToConversation.
     * This method allows you to send an activity to the end of a conversation.
     This is slightly different from ReplyToActivity().
     * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.
     * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.
     Use ReplyToActivity when replying to a specific activity in the conversation.
     Use SendToConversation in all other cases.
     *
     * @param conversationId Conversation ID
     * @param activity Activity to send
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceResponse object if successful.
     */
    ResourceResponse sendToConversation(String conversationId, Activity activity);

    /**
     * SendToConversation.
     * This method allows you to send an activity to the end of a conversation.
     This is slightly different from ReplyToActivity().
     * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.
     * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.
     Use ReplyToActivity when replying to a specific activity in the conversation.
     Use SendToConversation in all other cases.
     *
     * @param conversationId Conversation ID
     * @param activity Activity to send
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceResponse> sendToConversationAsync(String conversationId, Activity activity, final ServiceCallback<ResourceResponse> serviceCallback);

    /**
     * SendToConversation.
     * This method allows you to send an activity to the end of a conversation.
     This is slightly different from ReplyToActivity().
     * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.
     * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.
     Use ReplyToActivity when replying to a specific activity in the conversation.
     Use SendToConversation in all other cases.
     *
     * @param conversationId Conversation ID
     * @param activity Activity to send
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceResponse object
     */
    Observable<ResourceResponse> sendToConversationAsync(String conversationId, Activity activity);

    /**
     * SendToConversation.
     * This method allows you to send an activity to the end of a conversation.
     This is slightly different from ReplyToActivity().
     * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.
     * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.
     Use ReplyToActivity when replying to a specific activity in the conversation.
     Use SendToConversation in all other cases.
     *
     * @param conversationId Conversation ID
     * @param activity Activity to send
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceResponse object
     */
    Observable<ServiceResponse<ResourceResponse>> sendToConversationWithServiceResponseAsync(String conversationId, Activity activity);

    /**
     * UpdateActivity.
     * Edit an existing activity.
     Some channels allow you to edit an existing activity to reflect the new state of a bot conversation.
     For example, you can remove buttons after someone has clicked "Approve" button.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId to update
     * @param activity replacement Activity
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceResponse object if successful.
     */
    ResourceResponse updateActivity(String conversationId, String activityId, Activity activity);

    /**
     * UpdateActivity.
     * Edit an existing activity.
     Some channels allow you to edit an existing activity to reflect the new state of a bot conversation.
     For example, you can remove buttons after someone has clicked "Approve" button.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId to update
     * @param activity replacement Activity
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceResponse> updateActivityAsync(String conversationId, String activityId, Activity activity, final ServiceCallback<ResourceResponse> serviceCallback);

    /**
     * UpdateActivity.
     * Edit an existing activity.
     Some channels allow you to edit an existing activity to reflect the new state of a bot conversation.
     For example, you can remove buttons after someone has clicked "Approve" button.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId to update
     * @param activity replacement Activity
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceResponse object
     */
    Observable<ResourceResponse> updateActivityAsync(String conversationId, String activityId, Activity activity);

    /**
     * UpdateActivity.
     * Edit an existing activity.
     Some channels allow you to edit an existing activity to reflect the new state of a bot conversation.
     For example, you can remove buttons after someone has clicked "Approve" button.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId to update
     * @param activity replacement Activity
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceResponse object
     */
    Observable<ServiceResponse<ResourceResponse>> updateActivityWithServiceResponseAsync(String conversationId, String activityId, Activity activity);

    /**
     * ReplyToActivity.
     * This method allows you to reply to an activity.
     This is slightly different from SendToConversation().
     * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.
     * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.
     Use ReplyToActivity when replying to a specific activity in the conversation.
     Use SendToConversation in all other cases.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId the reply is to (OPTIONAL)
     * @param activity Activity to send
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceResponse object if successful.
     */
    ResourceResponse replyToActivity(String conversationId, String activityId, Activity activity);

    /**
     * ReplyToActivity.
     * This method allows you to reply to an activity.
     This is slightly different from SendToConversation().
     * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.
     * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.
     Use ReplyToActivity when replying to a specific activity in the conversation.
     Use SendToConversation in all other cases.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId the reply is to (OPTIONAL)
     * @param activity Activity to send
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceResponse> replyToActivityAsync(String conversationId, String activityId, Activity activity, final ServiceCallback<ResourceResponse> serviceCallback);

    /**
     * ReplyToActivity.
     * This method allows you to reply to an activity.
     This is slightly different from SendToConversation().
     * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.
     * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.
     Use ReplyToActivity when replying to a specific activity in the conversation.
     Use SendToConversation in all other cases.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId the reply is to (OPTIONAL)
     * @param activity Activity to send
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceResponse object
     */
    Observable<ResourceResponse> replyToActivityAsync(String conversationId, String activityId, Activity activity);

    /**
     * ReplyToActivity.
     * This method allows you to reply to an activity.
     This is slightly different from SendToConversation().
     * SendToConverstion(conversationId) - will append the activity to the end of the conversation according to the timestamp or semantics of the channel.
     * ReplyToActivity(conversationId,ActivityId) - adds the activity as a reply to another activity, if the channel supports it. If the channel does not support nested replies, ReplyToActivity falls back to SendToConversation.
     Use ReplyToActivity when replying to a specific activity in the conversation.
     Use SendToConversation in all other cases.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId the reply is to (OPTIONAL)
     * @param activity Activity to send
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceResponse object
     */
    Observable<ServiceResponse<ResourceResponse>> replyToActivityWithServiceResponseAsync(String conversationId, String activityId, Activity activity);

    /**
     * DeleteActivity.
     * Delete an existing activity.
     Some channels allow you to delete an existing activity, and if successful this method will remove the specified activity.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteActivity(String conversationId, String activityId);

    /**
     * DeleteActivity.
     * Delete an existing activity.
     Some channels allow you to delete an existing activity, and if successful this method will remove the specified activity.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId to delete
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteActivityAsync(String conversationId, String activityId, final ServiceCallback<Void> serviceCallback);

    /**
     * DeleteActivity.
     * Delete an existing activity.
     Some channels allow you to delete an existing activity, and if successful this method will remove the specified activity.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteActivityAsync(String conversationId, String activityId);

    /**
     * DeleteActivity.
     * Delete an existing activity.
     Some channels allow you to delete an existing activity, and if successful this method will remove the specified activity.
     *
     * @param conversationId Conversation ID
     * @param activityId activityId to delete
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteActivityWithServiceResponseAsync(String conversationId, String activityId);

    /**
     * GetConversationMembers.
     * Enumerate the members of a converstion.
     This REST API takes a ConversationId and returns an array of ChannelAccount objects representing the members of the conversation.
     *
     * @param conversationId Conversation ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ChannelAccount&gt; object if successful.
     */
    List<ChannelAccount> getConversationMembers(String conversationId);

    /**
     * GetConversationMembers.
     * Enumerate the members of a converstion.
     This REST API takes a ConversationId and returns an array of ChannelAccount objects representing the members of the conversation.
     *
     * @param conversationId Conversation ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ChannelAccount>> getConversationMembersAsync(String conversationId, final ServiceCallback<List<ChannelAccount>> serviceCallback);

    /**
     * GetConversationMembers.
     * Enumerate the members of a converstion.
     This REST API takes a ConversationId and returns an array of ChannelAccount objects representing the members of the conversation.
     *
     * @param conversationId Conversation ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ChannelAccount&gt; object
     */
    Observable<List<ChannelAccount>> getConversationMembersAsync(String conversationId);

    /**
     * GetConversationMembers.
     * Enumerate the members of a converstion.
     This REST API takes a ConversationId and returns an array of ChannelAccount objects representing the members of the conversation.
     *
     * @param conversationId Conversation ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ChannelAccount&gt; object
     */
    Observable<ServiceResponse<List<ChannelAccount>>> getConversationMembersWithServiceResponseAsync(String conversationId);

    /**
     * DeleteConversationMember.
     * Deletes a member from a converstion.
     This REST API takes a ConversationId and a memberId (of type string) and removes that member from the conversation. If that member was the last member
     of the conversation, the conversation will also be deleted.
     *
     * @param conversationId Conversation ID
     * @param memberId ID of the member to delete from this conversation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteConversationMember(String conversationId, String memberId);

    /**
     * DeleteConversationMember.
     * Deletes a member from a converstion.
     This REST API takes a ConversationId and a memberId (of type string) and removes that member from the conversation. If that member was the last member
     of the conversation, the conversation will also be deleted.
     *
     * @param conversationId Conversation ID
     * @param memberId ID of the member to delete from this conversation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteConversationMemberAsync(String conversationId, String memberId, final ServiceCallback<Void> serviceCallback);

    /**
     * DeleteConversationMember.
     * Deletes a member from a converstion.
     This REST API takes a ConversationId and a memberId (of type string) and removes that member from the conversation. If that member was the last member
     of the conversation, the conversation will also be deleted.
     *
     * @param conversationId Conversation ID
     * @param memberId ID of the member to delete from this conversation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteConversationMemberAsync(String conversationId, String memberId);

    /**
     * DeleteConversationMember.
     * Deletes a member from a converstion.
     This REST API takes a ConversationId and a memberId (of type string) and removes that member from the conversation. If that member was the last member
     of the conversation, the conversation will also be deleted.
     *
     * @param conversationId Conversation ID
     * @param memberId ID of the member to delete from this conversation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteConversationMemberWithServiceResponseAsync(String conversationId, String memberId);

    /**
     * GetActivityMembers.
     * Enumerate the members of an activity.
     This REST API takes a ConversationId and a ActivityId, returning an array of ChannelAccount objects representing the members of the particular activity in the conversation.
     *
     * @param conversationId Conversation ID
     * @param activityId Activity ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ChannelAccount&gt; object if successful.
     */
    List<ChannelAccount> getActivityMembers(String conversationId, String activityId);

    /**
     * GetActivityMembers.
     * Enumerate the members of an activity.
     This REST API takes a ConversationId and a ActivityId, returning an array of ChannelAccount objects representing the members of the particular activity in the conversation.
     *
     * @param conversationId Conversation ID
     * @param activityId Activity ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ChannelAccount>> getActivityMembersAsync(String conversationId, String activityId, final ServiceCallback<List<ChannelAccount>> serviceCallback);

    /**
     * GetActivityMembers.
     * Enumerate the members of an activity.
     This REST API takes a ConversationId and a ActivityId, returning an array of ChannelAccount objects representing the members of the particular activity in the conversation.
     *
     * @param conversationId Conversation ID
     * @param activityId Activity ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ChannelAccount&gt; object
     */
    Observable<List<ChannelAccount>> getActivityMembersAsync(String conversationId, String activityId);

    /**
     * GetActivityMembers.
     * Enumerate the members of an activity.
     This REST API takes a ConversationId and a ActivityId, returning an array of ChannelAccount objects representing the members of the particular activity in the conversation.
     *
     * @param conversationId Conversation ID
     * @param activityId Activity ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ChannelAccount&gt; object
     */
    Observable<ServiceResponse<List<ChannelAccount>>> getActivityMembersWithServiceResponseAsync(String conversationId, String activityId);

    /**
     * UploadAttachment.
     * Upload an attachment directly into a channel's blob storage.
     This is useful because it allows you to store data in a compliant store when dealing with enterprises.
     The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments API.
     *
     * @param conversationId Conversation ID
     * @param attachmentUpload Attachment data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceResponse object if successful.
     */
    ResourceResponse uploadAttachment(String conversationId, AttachmentData attachmentUpload);

    /**
     * UploadAttachment.
     * Upload an attachment directly into a channel's blob storage.
     This is useful because it allows you to store data in a compliant store when dealing with enterprises.
     The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments API.
     *
     * @param conversationId Conversation ID
     * @param attachmentUpload Attachment data
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceResponse> uploadAttachmentAsync(String conversationId, AttachmentData attachmentUpload, final ServiceCallback<ResourceResponse> serviceCallback);

    /**
     * UploadAttachment.
     * Upload an attachment directly into a channel's blob storage.
     This is useful because it allows you to store data in a compliant store when dealing with enterprises.
     The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments API.
     *
     * @param conversationId Conversation ID
     * @param attachmentUpload Attachment data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceResponse object
     */
    Observable<ResourceResponse> uploadAttachmentAsync(String conversationId, AttachmentData attachmentUpload);

    /**
     * UploadAttachment.
     * Upload an attachment directly into a channel's blob storage.
     This is useful because it allows you to store data in a compliant store when dealing with enterprises.
     The response is a ResourceResponse which contains an AttachmentId which is suitable for using with the attachments API.
     *
     * @param conversationId Conversation ID
     * @param attachmentUpload Attachment data
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceResponse object
     */
    Observable<ServiceResponse<ResourceResponse>> uploadAttachmentWithServiceResponseAsync(String conversationId, AttachmentData attachmentUpload);

}
