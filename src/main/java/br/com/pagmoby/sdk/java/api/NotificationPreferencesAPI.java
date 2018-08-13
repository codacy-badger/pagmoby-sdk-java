package br.com.pagmoby.sdk.java.api;

import br.com.pagmoby.sdk.java.Client;
import br.com.pagmoby.sdk.java.exception.ValidationException;
import br.com.pagmoby.sdk.java.request.NotificationPreferenceRequest;
import br.com.pagmoby.sdk.java.resource.NotificationPreference;
import br.com.pagmoby.sdk.java.response.NotificationPreferenceListResponse;

public class NotificationPreferencesAPI {

    private Client client;

    public NotificationPreferencesAPI(final Client client) {
        this.client = client;
    }

    public NotificationPreference create(final NotificationPreferenceRequest notificationPreference) {
        return client.post("/v2/preferences/notifications", notificationPreference, NotificationPreference.class);
    }

    public NotificationPreference get(final String notificationId) {
        return client.get("/v2/preferences/notifications/" + notificationId, NotificationPreference.class);
    }

    public Boolean delete(final String notificationId) {
        try {
            client.delete("/v2/preferences/notifications/" + notificationId, NotificationPreference.class);

            return true;
        } catch (ValidationException e) {
            if (e.getResponseCode() != 404) {
                throw new ValidationException(e.getResponseCode(), e.getResponseStatus(), e.getError());
            }
        }

        return false;
    }

    public NotificationPreferenceListResponse list() {
        return client.get("/v2/preferences/notifications", NotificationPreferenceListResponse.class);
    }
}
