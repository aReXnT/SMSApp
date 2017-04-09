package com.example.arexnt.myapplication.data;

import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;

/**
 * An interface for finding information about conversations and/or creating new ones.
 */

public class Conversation {
    private static final String TAG = "Mms/conv";
    private static final boolean DEBUG = false;
    private static final boolean DELETEDEBUG = false;

    public static final Uri sAllThreadsUri =
            Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();

    public static final String[] ALL_THREAD_PROJECTION = {
            Telephony.Threads._ID, Telephony.Threads.MESSAGE_COUNT, Telephony.Threads.RECIPIENT_IDS,
            Telephony.Threads.SNIPPET, Telephony.Threads.SNIPPET_CHARSET, Telephony.Threads.READ,
            Telephony.Threads.ERROR, Telephony.Threads.HAS_ATTACHMENT
    };

    public static final String[] UNREAD_PROJECTION = {
            Telephony.Threads._ID,
            Telephony.Threads.READ
    };

    public static final String UNREAD_SELECTION = "(read=0 OR seen=0)";
    public static final String FAILED_SELECTION = "error != 0";

    public static final String[] SEEN_PROJECTION = new String[]{"seen"};

    public static final int ID = 0;
    public static final int DATE = 1;
    public static final int MESSAGE_COUNT = 2;
    public static final int RECIPIENT_IDS = 3;
    public static final int SNIPPET = 4;
    public static final int SNIPPET_CS = 5;
    public static final int READ = 6;
    public static final int ERROR = 7;
    public static final int HAS_ATTACHMENT = 8;

    private final Context mContext;

    private long mThreadId;

    private ContactList mRecipients;    // The current set of recipients.
    private long mDate;                 // The last update time.
    private int mMessageCount;          // Number of messages.
    private String mSnippet;            // Text of the most recent message.
    private boolean mHasUnreadMessages; // True if there are unread messages.
    private boolean mHasAttachment;     // True if any message has an attachment.
    private boolean mHasError;          // True if any message is in an error state.
    private boolean mIsChecked;         // True if user has selected the conversation for a
}
