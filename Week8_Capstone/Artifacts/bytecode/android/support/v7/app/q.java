class android.support.v7.app.q {
  android.support.v7.app.q(android.content.Context, android.location.LocationManager);
    Code:
       0: aload_0
       1: invokespecial #19                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #6                  // class android/support/v7/app/q$a
       8: dup
       9: invokespecial #20                 // Method android/support/v7/app/q$a."<init>":()V
      12: putfield      #22                 // Field d:Landroid/support/v7/app/q$a;
      15: aload_0
      16: aload_1
      17: putfield      #24                 // Field b:Landroid/content/Context;
      20: aload_0
      21: aload_2
      22: putfield      #26                 // Field c:Landroid/location/LocationManager;
      25: return

  static android.support.v7.app.q a(android.content.Context);
    Code:
       0: getstatic     #51                 // Field a:Landroid/support/v7/app/q;
       3: ifnonnull     31
       6: aload_0
       7: invokevirtual #57                 // Method android/content/Context.getApplicationContext:()Landroid/content/Context;
      10: astore_0
      11: new           #2                  // class android/support/v7/app/q
      14: dup
      15: aload_0
      16: aload_0
      17: ldc           #59                 // String location
      19: invokevirtual #63                 // Method android/content/Context.getSystemService:(Ljava/lang/String;)Ljava/lang/Object;
      22: checkcast     #32                 // class android/location/LocationManager
      25: invokespecial #65                 // Method "<init>":(Landroid/content/Context;Landroid/location/LocationManager;)V
      28: putstatic     #51                 // Field a:Landroid/support/v7/app/q;
      31: getstatic     #51                 // Field a:Landroid/support/v7/app/q;
      34: areturn

  boolean a();
    Code:
       0: aload_0
       1: getfield      #22                 // Field d:Landroid/support/v7/app/q$a;
       4: astore_2
       5: aload_0
       6: invokespecial #145                // Method c:()Z
       9: ifeq          17
      12: aload_2
      13: getfield      #108                // Field android/support/v7/app/q$a.a:Z
      16: ireturn
      17: aload_0
      18: invokespecial #147                // Method b:()Landroid/location/Location;
      21: astore_3
      22: aload_3
      23: ifnull        36
      26: aload_0
      27: aload_3
      28: invokespecial #149                // Method a:(Landroid/location/Location;)V
      31: aload_2
      32: getfield      #108                // Field android/support/v7/app/q$a.a:Z
      35: ireturn
      36: ldc           #41                 // String TwilightManager
      38: ldc           #151                // String Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.
      40: invokestatic  #155                // Method android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
      43: pop
      44: invokestatic  #161                // Method java/util/Calendar.getInstance:()Ljava/util/Calendar;
      47: bipush        11
      49: invokevirtual #165                // Method java/util/Calendar.get:(I)I
      52: istore_1
      53: iload_1
      54: bipush        6
      56: if_icmplt     70
      59: iload_1
      60: bipush        22
      62: if_icmplt     68
      65: goto          70
      68: iconst_0
      69: ireturn
      70: iconst_1
      71: ireturn
}
