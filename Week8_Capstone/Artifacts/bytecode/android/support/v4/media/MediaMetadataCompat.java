public final class android.support.v4.media.MediaMetadataCompat implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> CREATOR;

  static final android.support.v4.g.a<java.lang.String, java.lang.Integer> a;

  final android.os.Bundle b;

  static {};
    Code:
       0: new           #26                 // class android/support/v4/g/a
       3: dup
       4: invokespecial #29                 // Method android/support/v4/g/a."<init>":()V
       7: putstatic     #31                 // Field a:Landroid/support/v4/g/a;
      10: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
      13: ldc           #33                 // String android.media.metadata.TITLE
      15: iconst_1
      16: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      19: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      22: pop
      23: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
      26: ldc           #45                 // String android.media.metadata.ARTIST
      28: iconst_1
      29: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      32: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      35: pop
      36: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
      39: ldc           #47                 // String android.media.metadata.DURATION
      41: iconst_0
      42: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      45: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      48: pop
      49: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
      52: ldc           #49                 // String android.media.metadata.ALBUM
      54: iconst_1
      55: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      58: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      61: pop
      62: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
      65: ldc           #51                 // String android.media.metadata.AUTHOR
      67: iconst_1
      68: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      71: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      74: pop
      75: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
      78: ldc           #53                 // String android.media.metadata.WRITER
      80: iconst_1
      81: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      84: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
      87: pop
      88: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
      91: ldc           #55                 // String android.media.metadata.COMPOSER
      93: iconst_1
      94: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      97: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     100: pop
     101: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     104: ldc           #57                 // String android.media.metadata.COMPILATION
     106: iconst_1
     107: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     110: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     113: pop
     114: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     117: ldc           #59                 // String android.media.metadata.DATE
     119: iconst_1
     120: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     123: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     126: pop
     127: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     130: ldc           #61                 // String android.media.metadata.YEAR
     132: iconst_0
     133: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     136: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     139: pop
     140: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     143: ldc           #63                 // String android.media.metadata.GENRE
     145: iconst_1
     146: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     149: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     152: pop
     153: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     156: ldc           #65                 // String android.media.metadata.TRACK_NUMBER
     158: iconst_0
     159: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     162: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     165: pop
     166: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     169: ldc           #67                 // String android.media.metadata.NUM_TRACKS
     171: iconst_0
     172: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     175: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     178: pop
     179: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     182: ldc           #69                 // String android.media.metadata.DISC_NUMBER
     184: iconst_0
     185: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     188: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     191: pop
     192: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     195: ldc           #71                 // String android.media.metadata.ALBUM_ARTIST
     197: iconst_1
     198: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     201: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     204: pop
     205: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     208: ldc           #73                 // String android.media.metadata.ART
     210: iconst_2
     211: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     214: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     217: pop
     218: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     221: ldc           #75                 // String android.media.metadata.ART_URI
     223: iconst_1
     224: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     227: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     230: pop
     231: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     234: ldc           #77                 // String android.media.metadata.ALBUM_ART
     236: iconst_2
     237: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     240: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     243: pop
     244: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     247: ldc           #79                 // String android.media.metadata.ALBUM_ART_URI
     249: iconst_1
     250: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     253: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     256: pop
     257: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     260: ldc           #81                 // String android.media.metadata.USER_RATING
     262: iconst_3
     263: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     266: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     269: pop
     270: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     273: ldc           #83                 // String android.media.metadata.RATING
     275: iconst_3
     276: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     279: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     282: pop
     283: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     286: ldc           #85                 // String android.media.metadata.DISPLAY_TITLE
     288: iconst_1
     289: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     292: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     295: pop
     296: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     299: ldc           #87                 // String android.media.metadata.DISPLAY_SUBTITLE
     301: iconst_1
     302: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     305: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     308: pop
     309: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     312: ldc           #89                 // String android.media.metadata.DISPLAY_DESCRIPTION
     314: iconst_1
     315: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     318: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     321: pop
     322: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     325: ldc           #91                 // String android.media.metadata.DISPLAY_ICON
     327: iconst_2
     328: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     331: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     334: pop
     335: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     338: ldc           #93                 // String android.media.metadata.DISPLAY_ICON_URI
     340: iconst_1
     341: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     344: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     347: pop
     348: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     351: ldc           #95                 // String android.media.metadata.MEDIA_ID
     353: iconst_1
     354: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     357: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     360: pop
     361: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     364: ldc           #97                 // String android.media.metadata.BT_FOLDER_TYPE
     366: iconst_0
     367: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     370: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     373: pop
     374: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     377: ldc           #99                 // String android.media.metadata.MEDIA_URI
     379: iconst_1
     380: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     383: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     386: pop
     387: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     390: ldc           #101                // String android.media.metadata.ADVERTISEMENT
     392: iconst_0
     393: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     396: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     399: pop
     400: getstatic     #31                 // Field a:Landroid/support/v4/g/a;
     403: ldc           #103                // String android.media.metadata.DOWNLOAD_STATUS
     405: iconst_0
     406: invokestatic  #39                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
     409: invokevirtual #43                 // Method android/support/v4/g/a.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
     412: pop
     413: bipush        7
     415: anewarray     #105                // class java/lang/String
     418: dup
     419: iconst_0
     420: ldc           #33                 // String android.media.metadata.TITLE
     422: aastore
     423: dup
     424: iconst_1
     425: ldc           #45                 // String android.media.metadata.ARTIST
     427: aastore
     428: dup
     429: iconst_2
     430: ldc           #49                 // String android.media.metadata.ALBUM
     432: aastore
     433: dup
     434: iconst_3
     435: ldc           #71                 // String android.media.metadata.ALBUM_ARTIST
     437: aastore
     438: dup
     439: iconst_4
     440: ldc           #53                 // String android.media.metadata.WRITER
     442: aastore
     443: dup
     444: iconst_5
     445: ldc           #51                 // String android.media.metadata.AUTHOR
     447: aastore
     448: dup
     449: bipush        6
     451: ldc           #55                 // String android.media.metadata.COMPOSER
     453: aastore
     454: putstatic     #107                // Field c:[Ljava/lang/String;
     457: iconst_3
     458: anewarray     #105                // class java/lang/String
     461: dup
     462: iconst_0
     463: ldc           #91                 // String android.media.metadata.DISPLAY_ICON
     465: aastore
     466: dup
     467: iconst_1
     468: ldc           #73                 // String android.media.metadata.ART
     470: aastore
     471: dup
     472: iconst_2
     473: ldc           #77                 // String android.media.metadata.ALBUM_ART
     475: aastore
     476: putstatic     #109                // Field d:[Ljava/lang/String;
     479: iconst_3
     480: anewarray     #105                // class java/lang/String
     483: dup
     484: iconst_0
     485: ldc           #93                 // String android.media.metadata.DISPLAY_ICON_URI
     487: aastore
     488: dup
     489: iconst_1
     490: ldc           #75                 // String android.media.metadata.ART_URI
     492: aastore
     493: dup
     494: iconst_2
     495: ldc           #79                 // String android.media.metadata.ALBUM_ART_URI
     497: aastore
     498: putstatic     #111                // Field e:[Ljava/lang/String;
     501: new           #8                  // class android/support/v4/media/MediaMetadataCompat$1
     504: dup
     505: invokespecial #112                // Method android/support/v4/media/MediaMetadataCompat$1."<init>":()V
     508: putstatic     #114                // Field CREATOR:Landroid/os/Parcelable$Creator;
     511: return

  android.support.v4.media.MediaMetadataCompat(android.os.Parcel);
    Code:
       0: aload_0
       1: invokespecial #117                // Method java/lang/Object."<init>":()V
       4: aload_0
       5: aload_1
       6: invokevirtual #123                // Method android/os/Parcel.readBundle:()Landroid/os/Bundle;
       9: putfield      #125                // Field b:Landroid/os/Bundle;
      12: aload_0
      13: getfield      #125                // Field b:Landroid/os/Bundle;
      16: ldc           #2                  // class android/support/v4/media/MediaMetadataCompat
      18: invokevirtual #131                // Method java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
      21: invokevirtual #137                // Method android/os/Bundle.setClassLoader:(Ljava/lang/ClassLoader;)V
      24: return

  public static android.support.v4.media.MediaMetadataCompat a(java.lang.Object);
    Code:
       0: aload_0
       1: ifnull        51
       4: getstatic     #144                // Field android/os/Build$VERSION.SDK_INT:I
       7: bipush        21
       9: if_icmplt     51
      12: invokestatic  #148                // Method android/os/Parcel.obtain:()Landroid/os/Parcel;
      15: astore_1
      16: aload_0
      17: aload_1
      18: iconst_0
      19: invokestatic  #153                // Method android/support/v4/media/c.a:(Ljava/lang/Object;Landroid/os/Parcel;I)V
      22: aload_1
      23: iconst_0
      24: invokevirtual #157                // Method android/os/Parcel.setDataPosition:(I)V
      27: getstatic     #114                // Field CREATOR:Landroid/os/Parcelable$Creator;
      30: aload_1
      31: invokeinterface #163,  2          // InterfaceMethod android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
      36: checkcast     #2                  // class android/support/v4/media/MediaMetadataCompat
      39: astore_2
      40: aload_1
      41: invokevirtual #166                // Method android/os/Parcel.recycle:()V
      44: aload_2
      45: aload_0
      46: putfield      #168                // Field f:Ljava/lang/Object;
      49: aload_2
      50: areturn
      51: aconst_null
      52: areturn

  public int describeContents();
    Code:
       0: iconst_0
       1: ireturn

  public void writeToParcel(android.os.Parcel, int);
    Code:
       0: aload_1
       1: aload_0
       2: getfield      #125                // Field b:Landroid/os/Bundle;
       5: invokevirtual #176                // Method android/os/Parcel.writeBundle:(Landroid/os/Bundle;)V
       8: return
}
