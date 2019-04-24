public final class android.support.v4.app.ak implements java.lang.Iterable<android.content.Intent> {
  static {};
    Code:
       0: getstatic     #28                 // Field android/os/Build$VERSION.SDK_INT:I
       3: bipush        16
       5: if_icmplt     21
       8: new           #12                 // class android/support/v4/app/ak$b
      11: dup
      12: invokespecial #31                 // Method android/support/v4/app/ak$b."<init>":()V
      15: astore_0
      16: aload_0
      17: putstatic     #33                 // Field a:Landroid/support/v4/app/ak$c;
      20: return
      21: new           #15                 // class android/support/v4/app/ak$c
      24: dup
      25: invokespecial #34                 // Method android/support/v4/app/ak$c."<init>":()V
      28: astore_0
      29: goto          16

  public static android.support.v4.app.ak a(android.content.Context);
    Code:
       0: new           #2                  // class android/support/v4/app/ak
       3: dup
       4: aload_0
       5: invokespecial #47                 // Method "<init>":(Landroid/content/Context;)V
       8: areturn

  public android.support.v4.app.ak a(android.app.Activity);
    Code:
       0: aload_1
       1: instanceof    #9                  // class android/support/v4/app/ak$a
       4: ifeq          20
       7: aload_1
       8: checkcast     #9                  // class android/support/v4/app/ak$a
      11: invokeinterface #52,  1           // InterfaceMethod android/support/v4/app/ak$a.getSupportParentActivityIntent:()Landroid/content/Intent;
      16: astore_2
      17: goto          22
      20: aconst_null
      21: astore_2
      22: aload_2
      23: astore_3
      24: aload_2
      25: ifnonnull     33
      28: aload_1
      29: invokestatic  #57                 // Method android/support/v4/app/aa.a:(Landroid/app/Activity;)Landroid/content/Intent;
      32: astore_3
      33: aload_3
      34: ifnull        72
      37: aload_3
      38: invokevirtual #63                 // Method android/content/Intent.getComponent:()Landroid/content/ComponentName;
      41: astore_2
      42: aload_2
      43: astore_1
      44: aload_2
      45: ifnonnull     60
      48: aload_3
      49: aload_0
      50: getfield      #44                 // Field c:Landroid/content/Context;
      53: invokevirtual #69                 // Method android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
      56: invokevirtual #73                 // Method android/content/Intent.resolveActivity:(Landroid/content/pm/PackageManager;)Landroid/content/ComponentName;
      59: astore_1
      60: aload_0
      61: aload_1
      62: invokevirtual #76                 // Method a:(Landroid/content/ComponentName;)Landroid/support/v4/app/ak;
      65: pop
      66: aload_0
      67: aload_3
      68: invokevirtual #79                 // Method a:(Landroid/content/Intent;)Landroid/support/v4/app/ak;
      71: pop
      72: aload_0
      73: areturn

  public android.support.v4.app.ak a(android.content.ComponentName);
    Code:
       0: aload_0
       1: getfield      #42                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #85                 // Method java/util/ArrayList.size:()I
       7: istore_2
       8: aload_0
       9: getfield      #44                 // Field c:Landroid/content/Context;
      12: astore        4
      14: aload_1
      15: astore_3
      16: aload         4
      18: astore_1
      19: aload_1
      20: aload_3
      21: invokestatic  #88                 // Method android/support/v4/app/aa.a:(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/content/Intent;
      24: astore_3
      25: aload_3
      26: ifnull        51
      29: aload_0
      30: getfield      #42                 // Field b:Ljava/util/ArrayList;
      33: iload_2
      34: aload_3
      35: invokevirtual #92                 // Method java/util/ArrayList.add:(ILjava/lang/Object;)V
      38: aload_0
      39: getfield      #44                 // Field c:Landroid/content/Context;
      42: astore_1
      43: aload_3
      44: invokevirtual #63                 // Method android/content/Intent.getComponent:()Landroid/content/ComponentName;
      47: astore_3
      48: goto          19
      51: aload_0
      52: areturn
      53: astore_1
      54: ldc           #94                 // String TaskStackBuilder
      56: ldc           #96                 // String Bad ComponentName while traversing activity parent metadata
      58: invokestatic  #102                // Method android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
      61: pop
      62: new           #104                // class java/lang/IllegalArgumentException
      65: dup
      66: aload_1
      67: invokespecial #107                // Method java/lang/IllegalArgumentException."<init>":(Ljava/lang/Throwable;)V
      70: athrow
    Exception table:
       from    to  target type
           8    14    53   Class android/content/pm/PackageManager$NameNotFoundException
          19    25    53   Class android/content/pm/PackageManager$NameNotFoundException
          29    48    53   Class android/content/pm/PackageManager$NameNotFoundException

  public android.support.v4.app.ak a(android.content.Intent);
    Code:
       0: aload_0
       1: getfield      #42                 // Field b:Ljava/util/ArrayList;
       4: aload_1
       5: invokevirtual #110                // Method java/util/ArrayList.add:(Ljava/lang/Object;)Z
       8: pop
       9: aload_0
      10: areturn

  public void a();
    Code:
       0: aload_0
       1: aconst_null
       2: invokevirtual #113                // Method a:(Landroid/os/Bundle;)V
       5: return

  public void a(android.os.Bundle);
    Code:
       0: aload_0
       1: getfield      #42                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #117                // Method java/util/ArrayList.isEmpty:()Z
       7: ifeq          20
      10: new           #119                // class java/lang/IllegalStateException
      13: dup
      14: ldc           #121                // String No intents added to TaskStackBuilder; cannot startActivities
      16: invokespecial #124                // Method java/lang/IllegalStateException."<init>":(Ljava/lang/String;)V
      19: athrow
      20: aload_0
      21: getfield      #42                 // Field b:Ljava/util/ArrayList;
      24: aload_0
      25: getfield      #42                 // Field b:Ljava/util/ArrayList;
      28: invokevirtual #85                 // Method java/util/ArrayList.size:()I
      31: anewarray     #59                 // class android/content/Intent
      34: invokevirtual #128                // Method java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
      37: checkcast     #130                // class "[Landroid/content/Intent;"
      40: astore_2
      41: aload_2
      42: iconst_0
      43: new           #59                 // class android/content/Intent
      46: dup
      47: aload_2
      48: iconst_0
      49: aaload
      50: invokespecial #133                // Method android/content/Intent."<init>":(Landroid/content/Intent;)V
      53: ldc           #134                // int 268484608
      55: invokevirtual #138                // Method android/content/Intent.addFlags:(I)Landroid/content/Intent;
      58: aastore
      59: aload_0
      60: getfield      #44                 // Field c:Landroid/content/Context;
      63: aload_2
      64: aload_1
      65: invokestatic  #143                // Method android/support/v4/a/a.a:(Landroid/content/Context;[Landroid/content/Intent;Landroid/os/Bundle;)Z
      68: ifne          100
      71: new           #59                 // class android/content/Intent
      74: dup
      75: aload_2
      76: aload_2
      77: arraylength
      78: iconst_1
      79: isub
      80: aaload
      81: invokespecial #133                // Method android/content/Intent."<init>":(Landroid/content/Intent;)V
      84: astore_1
      85: aload_1
      86: ldc           #144                // int 268435456
      88: invokevirtual #138                // Method android/content/Intent.addFlags:(I)Landroid/content/Intent;
      91: pop
      92: aload_0
      93: getfield      #44                 // Field c:Landroid/content/Context;
      96: aload_1
      97: invokevirtual #147                // Method android/content/Context.startActivity:(Landroid/content/Intent;)V
     100: return

  public java.util.Iterator<android.content.Intent> iterator();
    Code:
       0: aload_0
       1: getfield      #42                 // Field b:Ljava/util/ArrayList;
       4: invokevirtual #152                // Method java/util/ArrayList.iterator:()Ljava/util/Iterator;
       7: areturn
}
