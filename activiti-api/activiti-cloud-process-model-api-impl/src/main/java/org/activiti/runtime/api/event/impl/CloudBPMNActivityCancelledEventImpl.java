/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.runtime.api.event.impl;

import org.activiti.runtime.api.event.BPMNActivityEvent;
import org.activiti.runtime.api.event.CloudBPMNActivityCancelled;
import org.activiti.runtime.api.model.BPMNActivity;

public class CloudBPMNActivityCancelledEventImpl extends CloudBPMNActivityEventImpl implements CloudBPMNActivityCancelled {

    private String cause;

    public CloudBPMNActivityCancelledEventImpl() {
    }

    public CloudBPMNActivityCancelledEventImpl(BPMNActivity entity) {
        super(entity);
    }

    public CloudBPMNActivityCancelledEventImpl(String id,
                                               Long timestamp,
                                               BPMNActivity entity) {
        super(id,
              timestamp,
              entity);
    }

    @Override
    public BPMNActivityEvent.ActivityEvents getEventType() {
        return BPMNActivityEvent.ActivityEvents.ACTIVITY_CANCELLED;
    }

    @Override
    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }
}
