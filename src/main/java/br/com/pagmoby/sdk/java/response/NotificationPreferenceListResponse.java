package br.com.pagmoby.sdk.java.response;

import br.com.pagmoby.sdk.java.resource.NotificationPreference;

import java.util.ArrayList;

public class NotificationPreferenceListResponse extends ArrayList<NotificationPreference> {

    @Override
    public String toString() {
        StringBuilder sb =  new StringBuilder("NotificationPreferenceListResponse [");

        for (int i = 0; i < this.size(); i ++) {

            if (i > 0) {
                sb.append(",");
            }
            sb.append("(").append(this.get(i)).append(")");
        }
        sb.append("]");
        return sb.toString();
    }
}
