public class android.support.v4.app.ac$b {
  android.os.Bundle A;

  int B;

  int C;

  android.app.Notification D;

  android.widget.RemoteViews E;

  android.widget.RemoteViews F;

  android.widget.RemoteViews G;

  java.lang.String H;

  int I;

  java.lang.String J;

  long K;

  int L;

  android.app.Notification M;

  public java.util.ArrayList<java.lang.String> N;

  public android.content.Context a;

  public java.util.ArrayList<android.support.v4.app.ac$a> b;

  java.lang.CharSequence c;

  java.lang.CharSequence d;

  android.app.PendingIntent e;

  android.app.PendingIntent f;

  android.widget.RemoteViews g;

  android.graphics.Bitmap h;

  java.lang.CharSequence i;

  int j;

  int k;

  boolean l;

  boolean m;

  android.support.v4.app.ac$c n;

  java.lang.CharSequence o;

  java.lang.CharSequence[] p;

  int q;

  int r;

  boolean s;

  java.lang.String t;

  boolean u;

  java.lang.String v;

  boolean w;

  boolean x;

  boolean y;

  java.lang.String z;

  public android.support.v4.app.ac$b(android.content.Context);
    Code:
       0: aload_0
       1: aload_1
       2: aconst_null
       3: invokespecial #66                 // Method "<init>":(Landroid/content/Context;Ljava/lang/String;)V
       6: return

  public android.support.v4.app.ac$b(android.content.Context, java.lang.String);
    Code:
       0: aload_0
       1: invokespecial #71                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #73                 // class java/util/ArrayList
       8: dup
       9: invokespecial #74                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #76                 // Field b:Ljava/util/ArrayList;
      15: aload_0
      16: iconst_1
      17: putfield      #78                 // Field l:Z
      20: aload_0
      21: iconst_0
      22: putfield      #80                 // Field w:Z
      25: aload_0
      26: iconst_0
      27: putfield      #82                 // Field B:I
      30: aload_0
      31: iconst_0
      32: putfield      #84                 // Field C:I
      35: aload_0
      36: iconst_0
      37: putfield      #86                 // Field I:I
      40: aload_0
      41: iconst_0
      42: putfield      #88                 // Field L:I
      45: aload_0
      46: new           #90                 // class android/app/Notification
      49: dup
      50: invokespecial #91                 // Method android/app/Notification."<init>":()V
      53: putfield      #93                 // Field M:Landroid/app/Notification;
      56: aload_0
      57: aload_1
      58: putfield      #95                 // Field a:Landroid/content/Context;
      61: aload_0
      62: aload_2
      63: putfield      #97                 // Field H:Ljava/lang/String;
      66: aload_0
      67: getfield      #93                 // Field M:Landroid/app/Notification;
      70: invokestatic  #103                // Method java/lang/System.currentTimeMillis:()J
      73: putfield      #106                // Field android/app/Notification.when:J
      76: aload_0
      77: getfield      #93                 // Field M:Landroid/app/Notification;
      80: iconst_m1
      81: putfield      #109                // Field android/app/Notification.audioStreamType:I
      84: aload_0
      85: iconst_0
      86: putfield      #111                // Field k:I
      89: aload_0
      90: new           #73                 // class java/util/ArrayList
      93: dup
      94: invokespecial #74                 // Method java/util/ArrayList."<init>":()V
      97: putfield      #113                // Field N:Ljava/util/ArrayList;
     100: return

  protected static java.lang.CharSequence c(java.lang.CharSequence);
    Code:
       0: aload_0
       1: ifnonnull     6
       4: aload_0
       5: areturn
       6: aload_0
       7: astore_1
       8: aload_0
       9: invokeinterface #124,  1          // InterfaceMethod java/lang/CharSequence.length:()I
      14: sipush        5120
      17: if_icmple     31
      20: aload_0
      21: iconst_0
      22: sipush        5120
      25: invokeinterface #128,  3          // InterfaceMethod java/lang/CharSequence.subSequence:(II)Ljava/lang/CharSequence;
      30: astore_1
      31: aload_1
      32: areturn

  public android.app.Notification a();
    Code:
       0: new           #131                // class android/support/v4/app/ad
       3: dup
       4: aload_0
       5: invokespecial #134                // Method android/support/v4/app/ad."<init>":(Landroid/support/v4/app/ac$b;)V
       8: invokevirtual #136                // Method android/support/v4/app/ad.a:()Landroid/app/Notification;
      11: areturn

  public android.support.v4.app.ac$b a(int);
    Code:
       0: aload_0
       1: getfield      #93                 // Field M:Landroid/app/Notification;
       4: iload_1
       5: putfield      #140                // Field android/app/Notification.icon:I
       8: aload_0
       9: areturn

  public android.support.v4.app.ac$b a(android.app.PendingIntent);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #143                // Field e:Landroid/app/PendingIntent;
       5: aload_0
       6: areturn

  public android.support.v4.app.ac$b a(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #146                // Method c:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
       5: putfield      #148                // Field c:Ljava/lang/CharSequence;
       8: aload_0
       9: areturn

  public android.support.v4.app.ac$b a(boolean);
    Code:
       0: aload_0
       1: iconst_2
       2: iload_1
       3: invokespecial #151                // Method a:(IZ)V
       6: aload_0
       7: areturn

  public android.support.v4.app.ac$b b(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #111                // Field k:I
       5: aload_0
       6: areturn

  public android.support.v4.app.ac$b b(java.lang.CharSequence);
    Code:
       0: aload_0
       1: aload_1
       2: invokestatic  #146                // Method c:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
       5: putfield      #153                // Field d:Ljava/lang/CharSequence;
       8: aload_0
       9: areturn

  public android.support.v4.app.ac$b b(boolean);
    Code:
       0: aload_0
       1: bipush        16
       3: iload_1
       4: invokespecial #151                // Method a:(IZ)V
       7: aload_0
       8: areturn

  public android.support.v4.app.ac$b c(int);
    Code:
       0: aload_0
       1: iload_1
       2: putfield      #84                 // Field C:I
       5: aload_0
       6: areturn
}
