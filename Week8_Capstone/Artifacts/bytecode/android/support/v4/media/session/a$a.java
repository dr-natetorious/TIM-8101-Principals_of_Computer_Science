public abstract class android.support.v4.media.session.a$a extends android.os.Binder implements android.support.v4.media.session.a {
  public android.support.v4.media.session.a$a();
    Code:
       0: aload_0
       1: invokespecial #13                 // Method android/os/Binder."<init>":()V
       4: aload_0
       5: aload_0
       6: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
       8: invokevirtual #19                 // Method attachInterface:(Landroid/os/IInterface;Ljava/lang/String;)V
      11: return

  public static android.support.v4.media.session.a a(android.os.IBinder);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aconst_null
       5: areturn
       6: aload_0
       7: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
       9: invokeinterface #27,  2           // InterfaceMethod android/os/IBinder.queryLocalInterface:(Ljava/lang/String;)Landroid/os/IInterface;
      14: astore_1
      15: aload_1
      16: ifnull        31
      19: aload_1
      20: instanceof    #6                  // class android/support/v4/media/session/a
      23: ifeq          31
      26: aload_1
      27: checkcast     #6                  // class android/support/v4/media/session/a
      30: areturn
      31: new           #9                  // class android/support/v4/media/session/a$a$a
      34: dup
      35: aload_0
      36: invokespecial #30                 // Method android/support/v4/media/session/a$a$a."<init>":(Landroid/os/IBinder;)V
      39: areturn

  public android.os.IBinder asBinder();
    Code:
       0: aload_0
       1: areturn

  public boolean onTransact(int, android.os.Parcel, android.os.Parcel, int);
    Code:
       0: iload_1
       1: ldc           #35                 // int 1598968902
       3: if_icmpeq     457
       6: iconst_0
       7: istore        6
       9: iconst_0
      10: istore        5
      12: aconst_null
      13: astore        9
      15: aconst_null
      16: astore        10
      18: aconst_null
      19: astore        11
      21: aconst_null
      22: astore        12
      24: aconst_null
      25: astore        7
      27: aconst_null
      28: astore        8
      30: iload_1
      31: tableswitch   { // 1 to 13
                     1: 413
                     2: 401
                     3: 365
                     4: 329
                     5: 310
                     6: 274
                     7: 238
                     8: 202
                     9: 186
                    10: 158
                    11: 134
                    12: 118
                    13: 106
               default: 96
          }
      96: aload_0
      97: iload_1
      98: aload_2
      99: aload_3
     100: iload         4
     102: invokespecial #37                 // Method android/os/Binder.onTransact:(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
     105: ireturn
     106: aload_2
     107: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     109: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     112: aload_0
     113: invokevirtual #46                 // Method b:()V
     116: iconst_1
     117: ireturn
     118: aload_2
     119: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     121: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     124: aload_0
     125: aload_2
     126: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     129: invokevirtual #53                 // Method b:(I)V
     132: iconst_1
     133: ireturn
     134: aload_2
     135: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     137: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     140: aload_2
     141: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     144: ifeq          150
     147: iconst_1
     148: istore        5
     150: aload_0
     151: iload         5
     153: invokevirtual #56                 // Method b:(Z)V
     156: iconst_1
     157: ireturn
     158: aload_2
     159: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     161: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     164: iload         6
     166: istore        5
     168: aload_2
     169: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     172: ifeq          178
     175: iconst_1
     176: istore        5
     178: aload_0
     179: iload         5
     181: invokevirtual #58                 // Method a:(Z)V
     184: iconst_1
     185: ireturn
     186: aload_2
     187: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     189: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     192: aload_0
     193: aload_2
     194: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     197: invokevirtual #60                 // Method a:(I)V
     200: iconst_1
     201: ireturn
     202: aload_2
     203: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     205: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     208: aload         8
     210: astore_3
     211: aload_2
     212: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     215: ifeq          231
     218: getstatic     #66                 // Field android/support/v4/media/session/ParcelableVolumeInfo.CREATOR:Landroid/os/Parcelable$Creator;
     221: aload_2
     222: invokeinterface #72,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
     227: checkcast     #62                 // class android/support/v4/media/session/ParcelableVolumeInfo
     230: astore_3
     231: aload_0
     232: aload_3
     233: invokevirtual #75                 // Method a:(Landroid/support/v4/media/session/ParcelableVolumeInfo;)V
     236: iconst_1
     237: ireturn
     238: aload_2
     239: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     241: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     244: aload         9
     246: astore_3
     247: aload_2
     248: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     251: ifeq          267
     254: getstatic     #78                 // Field android/os/Bundle.CREATOR:Landroid/os/Parcelable$Creator;
     257: aload_2
     258: invokeinterface #72,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
     263: checkcast     #77                 // class android/os/Bundle
     266: astore_3
     267: aload_0
     268: aload_3
     269: invokevirtual #81                 // Method a:(Landroid/os/Bundle;)V
     272: iconst_1
     273: ireturn
     274: aload_2
     275: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     277: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     280: aload         10
     282: astore_3
     283: aload_2
     284: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     287: ifeq          303
     290: getstatic     #86                 // Field android/text/TextUtils.CHAR_SEQUENCE_CREATOR:Landroid/os/Parcelable$Creator;
     293: aload_2
     294: invokeinterface #72,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
     299: checkcast     #88                 // class java/lang/CharSequence
     302: astore_3
     303: aload_0
     304: aload_3
     305: invokevirtual #91                 // Method a:(Ljava/lang/CharSequence;)V
     308: iconst_1
     309: ireturn
     310: aload_2
     311: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     313: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     316: aload_0
     317: aload_2
     318: getstatic     #94                 // Field android/support/v4/media/session/MediaSessionCompat$QueueItem.CREATOR:Landroid/os/Parcelable$Creator;
     321: invokevirtual #98                 // Method android/os/Parcel.createTypedArrayList:(Landroid/os/Parcelable$Creator;)Ljava/util/ArrayList;
     324: invokevirtual #101                // Method a:(Ljava/util/List;)V
     327: iconst_1
     328: ireturn
     329: aload_2
     330: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     332: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     335: aload         11
     337: astore_3
     338: aload_2
     339: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     342: ifeq          358
     345: getstatic     #104                // Field android/support/v4/media/MediaMetadataCompat.CREATOR:Landroid/os/Parcelable$Creator;
     348: aload_2
     349: invokeinterface #72,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
     354: checkcast     #103                // class android/support/v4/media/MediaMetadataCompat
     357: astore_3
     358: aload_0
     359: aload_3
     360: invokevirtual #107                // Method a:(Landroid/support/v4/media/MediaMetadataCompat;)V
     363: iconst_1
     364: ireturn
     365: aload_2
     366: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     368: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     371: aload         12
     373: astore_3
     374: aload_2
     375: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     378: ifeq          394
     381: getstatic     #110                // Field android/support/v4/media/session/PlaybackStateCompat.CREATOR:Landroid/os/Parcelable$Creator;
     384: aload_2
     385: invokeinterface #72,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
     390: checkcast     #109                // class android/support/v4/media/session/PlaybackStateCompat
     393: astore_3
     394: aload_0
     395: aload_3
     396: invokevirtual #113                // Method a:(Landroid/support/v4/media/session/PlaybackStateCompat;)V
     399: iconst_1
     400: ireturn
     401: aload_2
     402: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     404: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     407: aload_0
     408: invokevirtual #115                // Method a:()V
     411: iconst_1
     412: ireturn
     413: aload_2
     414: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     416: invokevirtual #43                 // Method android/os/Parcel.enforceInterface:(Ljava/lang/String;)V
     419: aload_2
     420: invokevirtual #119                // Method android/os/Parcel.readString:()Ljava/lang/String;
     423: astore        8
     425: aload         7
     427: astore_3
     428: aload_2
     429: invokevirtual #50                 // Method android/os/Parcel.readInt:()I
     432: ifeq          448
     435: getstatic     #78                 // Field android/os/Bundle.CREATOR:Landroid/os/Parcelable$Creator;
     438: aload_2
     439: invokeinterface #72,  2           // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
     444: checkcast     #77                 // class android/os/Bundle
     447: astore_3
     448: aload_0
     449: aload         8
     451: aload_3
     452: invokevirtual #122                // Method a:(Ljava/lang/String;Landroid/os/Bundle;)V
     455: iconst_1
     456: ireturn
     457: aload_3
     458: ldc           #15                 // String android.support.v4.media.session.IMediaControllerCallback
     460: invokevirtual #125                // Method android/os/Parcel.writeString:(Ljava/lang/String;)V
     463: iconst_1
     464: ireturn
}
