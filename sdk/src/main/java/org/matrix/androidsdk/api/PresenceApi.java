/*
 * Copyright 2014 OpenMarket Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.matrix.androidsdk.api;

import org.matrix.androidsdk.api.response.User;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * The presence REST API.
 */
public interface PresenceApi {

    /**
     * Set this user's presence state.
     * @param userId the user id
     * @param userPresence a User object with possibly the presence and statusMsg fields
     * @param callback the asynchronous callback called when finished
     */
    @PUT("/presence/{userId}/status")
    public void presenceStatus(@Path("userId") String userId, @Body User userPresence, Callback<Void> callback);

    /**
     * Get a user's presence state.
     * @param userId the user id
     * @param callback the asynchronous callback called with the response
     */
    @GET("/presence/{userId}/status")
    public void presenceStatus(@Path("userId") String userId, Callback<User> callback);
}