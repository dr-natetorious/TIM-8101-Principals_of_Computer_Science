public abstract class ryey.easer.core.d {
  protected final android.content.Context a;

  protected final ryey.easer.core.a.k b;

  protected final java.util.concurrent.ExecutorService c;

  protected final ryey.easer.core.ConditionHolderService$a d;

  protected final ryey.easer.core.a$a e;

  protected java.util.List<ryey.easer.core.d> f;

  protected boolean g;

  protected final android.net.Uri h;

  protected ryey.easer.core.d(android.content.Context, ryey.easer.core.a.k, java.util.concurrent.ExecutorService, ryey.easer.core.ConditionHolderService$a, ryey.easer.core.a$a);
    Code:
       0: aload_0
       1: invokespecial #34                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: new           #36                 // class java/util/ArrayList
       8: dup
       9: invokespecial #37                 // Method java/util/ArrayList."<init>":()V
      12: putfield      #39                 // Field f:Ljava/util/List;
      15: aload_0
      16: iconst_0
      17: putfield      #41                 // Field g:Z
      20: aload_0
      21: getstatic     #47                 // Field java/util/Locale.US:Ljava/util/Locale;
      24: ldc           #49                 // String lotus://%d
      26: iconst_1
      27: anewarray     #4                  // class java/lang/Object
      30: dup
      31: iconst_0
      32: aload_0
      33: invokevirtual #53                 // Method java/lang/Object.hashCode:()I
      36: invokestatic  #59                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      39: aastore
      40: invokestatic  #65                 // Method java/lang/String.format:(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
      43: invokestatic  #71                 // Method android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
      46: putfield      #73                 // Field h:Landroid/net/Uri;
      49: aload_0
      50: new           #6                  // class ryey/easer/core/d$1
      53: dup
      54: aload_0
      55: invokespecial #76                 // Method ryey/easer/core/d$1."<init>":(Lryey/easer/core/d;)V
      58: putfield      #78                 // Field i:Landroid/content/BroadcastReceiver;
      61: aload_0
      62: new           #80                 // class android/content/IntentFilter
      65: dup
      66: invokespecial #81                 // Method android/content/IntentFilter."<init>":()V
      69: putfield      #83                 // Field j:Landroid/content/IntentFilter;
      72: aload_0
      73: getfield      #83                 // Field j:Landroid/content/IntentFilter;
      76: ldc           #85                 // String ryey.easer.triggerlotus.action.SLOT_SATISFIED
      78: invokevirtual #89                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      81: aload_0
      82: getfield      #83                 // Field j:Landroid/content/IntentFilter;
      85: ldc           #91                 // String ryey.easer.triggerlotus.action.SLOT_UNSATISFIED
      87: invokevirtual #89                 // Method android/content/IntentFilter.addAction:(Ljava/lang/String;)V
      90: aload_0
      91: getfield      #83                 // Field j:Landroid/content/IntentFilter;
      94: ldc           #93                 // String ryey.easer.triggerlotus.category.NOTIFY_LOTUS
      96: invokevirtual #96                 // Method android/content/IntentFilter.addCategory:(Ljava/lang/String;)V
      99: aload_0
     100: getfield      #83                 // Field j:Landroid/content/IntentFilter;
     103: aload_0
     104: getfield      #73                 // Field h:Landroid/net/Uri;
     107: invokevirtual #100                // Method android/net/Uri.getScheme:()Ljava/lang/String;
     110: invokevirtual #103                // Method android/content/IntentFilter.addDataScheme:(Ljava/lang/String;)V
     113: aload_0
     114: getfield      #83                 // Field j:Landroid/content/IntentFilter;
     117: aload_0
     118: getfield      #73                 // Field h:Landroid/net/Uri;
     121: invokevirtual #106                // Method android/net/Uri.getAuthority:()Ljava/lang/String;
     124: aconst_null
     125: invokevirtual #110                // Method android/content/IntentFilter.addDataAuthority:(Ljava/lang/String;Ljava/lang/String;)V
     128: aload_0
     129: getfield      #83                 // Field j:Landroid/content/IntentFilter;
     132: aload_0
     133: getfield      #73                 // Field h:Landroid/net/Uri;
     136: invokevirtual #113                // Method android/net/Uri.getPath:()Ljava/lang/String;
     139: iconst_0
     140: invokevirtual #117                // Method android/content/IntentFilter.addDataPath:(Ljava/lang/String;I)V
     143: aload_0
     144: aload_1
     145: putfield      #119                // Field a:Landroid/content/Context;
     148: aload_0
     149: aload_2
     150: putfield      #121                // Field b:Lryey/easer/core/a/k;
     153: aload_0
     154: aload_3
     155: putfield      #123                // Field c:Ljava/util/concurrent/ExecutorService;
     158: aload_0
     159: aload         4
     161: putfield      #125                // Field d:Lryey/easer/core/ConditionHolderService$a;
     164: aload_0
     165: aload         5
     167: putfield      #127                // Field e:Lryey/easer/core/a$a;
     170: return

  static ryey.easer.core.d a(android.content.Context, ryey.easer.core.a.k, java.util.concurrent.ExecutorService, ryey.easer.core.ConditionHolderService$a, ryey.easer.core.a$a);
    Code:
       0: aload_1
       1: invokevirtual #134                // Method ryey/easer/core/a/k.b:()Z
       4: ifeq          21
       7: new           #136                // class ryey/easer/core/c
      10: dup
      11: aload_0
      12: aload_1
      13: aload_2
      14: aload_3
      15: aload         4
      17: invokespecial #138                // Method ryey/easer/core/c."<init>":(Landroid/content/Context;Lryey/easer/core/a/k;Ljava/util/concurrent/ExecutorService;Lryey/easer/core/ConditionHolderService$a;Lryey/easer/core/a$a;)V
      20: areturn
      21: new           #140                // class ryey/easer/core/b
      24: dup
      25: aload_0
      26: aload_1
      27: aload_2
      28: aload_3
      29: aload         4
      31: invokespecial #141                // Method ryey/easer/core/b."<init>":(Landroid/content/Context;Lryey/easer/core/a/k;Ljava/util/concurrent/ExecutorService;Lryey/easer/core/ConditionHolderService$a;Lryey/easer/core/a$a;)V
      34: areturn

  protected void a();
    Code:
       0: return

  protected void a(android.os.Bundle);
    Code:
       0: ldc           #144                // String Lotus for <%s> satisfied
       2: iconst_1
       3: anewarray     #4                  // class java/lang/Object
       6: dup
       7: iconst_0
       8: aload_0
       9: getfield      #121                // Field b:Lryey/easer/core/a/k;
      12: invokevirtual #146                // Method ryey/easer/core/a/k.a:()Ljava/lang/String;
      15: aastore
      16: invokestatic  #151                // Method com/b/a/i.c:(Ljava/lang/String;[Ljava/lang/Object;)V
      19: aload_0
      20: iconst_1
      21: putfield      #41                 // Field g:Z
      24: aload_0
      25: getfield      #121                // Field b:Lryey/easer/core/a/k;
      28: invokevirtual #153                // Method ryey/easer/core/a/k.i:()Ljava/lang/String;
      31: astore_3
      32: aload_3
      33: ifnull        76
      36: aload_1
      37: astore_2
      38: aload_1
      39: ifnonnull     50
      42: new           #155                // class android/os/Bundle
      45: dup
      46: invokespecial #156                // Method android/os/Bundle."<init>":()V
      49: astore_2
      50: aload_0
      51: getfield      #127                // Field e:Lryey/easer/core/a$a;
      54: aload_3
      55: aload_0
      56: getfield      #121                // Field b:Lryey/easer/core/a/k;
      59: invokevirtual #146                // Method ryey/easer/core/a/k.a:()Ljava/lang/String;
      62: aload_2
      63: aload_0
      64: getfield      #121                // Field b:Lryey/easer/core/a/k;
      67: invokevirtual #160                // Method ryey/easer/core/a/k.k:()Lryey/easer/core/a/j;
      70: invokevirtual #166                // Method ryey/easer/core/a/j.n:()Lryey/easer/commons/local_plugin/b/b;
      73: invokevirtual #171                // Method ryey/easer/core/a$a.a:(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lryey/easer/commons/local_plugin/b/b;)V
      76: aload_0
      77: invokevirtual #173                // Method g:()V
      80: return

  void a(boolean);
    Code:
       0: aload_0
       1: monitorenter
       2: iload_1
       3: ifeq          14
       6: aload_0
       7: aconst_null
       8: invokevirtual #176                // Method a:(Landroid/os/Bundle;)V
      11: goto          18
      14: aload_0
      15: invokevirtual #178                // Method c:()V
      18: aload_0
      19: monitorexit
      20: return
      21: aload_0
      22: monitorexit
      23: aload_2
      24: athrow
      25: astore_2
      26: goto          21
    Exception table:
       from    to  target type
           6    11    25   any
          14    18    25   any

  protected void a(boolean, android.os.Bundle);
    Code:
       0: iload_1
       1: aload_0
       2: getfield      #121                // Field b:Lryey/easer/core/a/k;
       5: invokevirtual #181                // Method ryey/easer/core/a/k.e:()Z
       8: if_icmpeq     17
      11: aload_0
      12: aload_2
      13: invokevirtual #176                // Method a:(Landroid/os/Bundle;)V
      16: return
      17: aload_0
      18: invokevirtual #178                // Method c:()V
      21: return

  protected void b();
    Code:
       0: return

  protected void b(boolean);
    Code:
       0: aload_0
       1: iload_1
       2: aconst_null
       3: invokevirtual #183                // Method a:(ZLandroid/os/Bundle;)V
       6: return

  protected void c();
    Code:
       0: ldc           #185                // String Lotus for <%s> unsatisfied
       2: iconst_1
       3: anewarray     #4                  // class java/lang/Object
       6: dup
       7: iconst_0
       8: aload_0
       9: getfield      #121                // Field b:Lryey/easer/core/a/k;
      12: invokevirtual #146                // Method ryey/easer/core/a/k.a:()Ljava/lang/String;
      15: aastore
      16: invokestatic  #151                // Method com/b/a/i.c:(Ljava/lang/String;[Ljava/lang/Object;)V
      19: aload_0
      20: iconst_0
      21: putfield      #41                 // Field g:Z
      24: getstatic     #190                // Field ryey/easer/core/log/ActivityLogService.a:Lryey/easer/core/log/ActivityLogService$b;
      27: aload_0
      28: getfield      #119                // Field a:Landroid/content/Context;
      31: aload_0
      32: getfield      #121                // Field b:Lryey/easer/core/a/k;
      35: invokevirtual #146                // Method ryey/easer/core/a/k.a:()Ljava/lang/String;
      38: aconst_null
      39: invokevirtual #195                // Method ryey/easer/core/log/ActivityLogService$b.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
      42: aload_0
      43: getfield      #39                 // Field f:Ljava/util/List;
      46: invokeinterface #201,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      51: astore_1
      52: aload_1
      53: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      58: ifeq          76
      61: aload_1
      62: invokeinterface #210,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      67: checkcast     #2                  // class ryey/easer/core/d
      70: invokevirtual #212                // Method f:()V
      73: goto          52
      76: aload_0
      77: getfield      #39                 // Field f:Ljava/util/List;
      80: invokeinterface #215,  1          // InterfaceMethod java/util/List.clear:()V
      85: return

  final java.lang.String d();
    Code:
       0: aload_0
       1: getfield      #121                // Field b:Lryey/easer/core/a/k;
       4: invokevirtual #146                // Method ryey/easer/core/a/k.a:()Ljava/lang/String;
       7: areturn

  final void e();
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #119                // Field a:Landroid/content/Context;
       6: aload_0
       7: getfield      #78                 // Field i:Landroid/content/BroadcastReceiver;
      10: aload_0
      11: getfield      #83                 // Field j:Landroid/content/IntentFilter;
      14: invokevirtual #221                // Method android/content/Context.registerReceiver:(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
      17: pop
      18: aload_0
      19: invokevirtual #223                // Method a:()V
      22: aload_0
      23: monitorexit
      24: return
      25: astore_1
      26: aload_0
      27: monitorexit
      28: aload_1
      29: athrow
    Exception table:
       from    to  target type
           2    22    25   any

  final void f();
    Code:
       0: aload_0
       1: monitorenter
       2: aload_0
       3: getfield      #119                // Field a:Landroid/content/Context;
       6: aload_0
       7: getfield      #78                 // Field i:Landroid/content/BroadcastReceiver;
      10: invokevirtual #227                // Method android/content/Context.unregisterReceiver:(Landroid/content/BroadcastReceiver;)V
      13: aload_0
      14: invokevirtual #229                // Method b:()V
      17: aload_0
      18: getfield      #39                 // Field f:Ljava/util/List;
      21: invokeinterface #201,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      26: astore_1
      27: aload_1
      28: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      33: ifeq          51
      36: aload_1
      37: invokeinterface #210,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      42: checkcast     #2                  // class ryey/easer/core/d
      45: invokevirtual #212                // Method f:()V
      48: goto          27
      51: aload_0
      52: getfield      #39                 // Field f:Ljava/util/List;
      55: invokeinterface #215,  1          // InterfaceMethod java/util/List.clear:()V
      60: aload_0
      61: monitorexit
      62: return
      63: astore_1
      64: aload_0
      65: monitorexit
      66: aload_1
      67: athrow
    Exception table:
       from    to  target type
           2    27    63   any
          27    48    63   any
          51    60    63   any

  protected void g();
    Code:
       0: aload_0
       1: monitorenter
       2: ldc           #231                // String  <%s> start children's listening
       4: iconst_1
       5: anewarray     #4                  // class java/lang/Object
       8: dup
       9: iconst_0
      10: aload_0
      11: getfield      #121                // Field b:Lryey/easer/core/a/k;
      14: invokevirtual #146                // Method ryey/easer/core/a/k.a:()Ljava/lang/String;
      17: aastore
      18: invokestatic  #233                // Method com/b/a/i.d:(Ljava/lang/String;[Ljava/lang/Object;)V
      21: aload_0
      22: getfield      #121                // Field b:Lryey/easer/core/a/k;
      25: invokevirtual #236                // Method ryey/easer/core/a/k.h:()Ljava/util/List;
      28: invokeinterface #201,  1          // InterfaceMethod java/util/List.iterator:()Ljava/util/Iterator;
      33: astore_1
      34: aload_1
      35: invokeinterface #206,  1          // InterfaceMethod java/util/Iterator.hasNext:()Z
      40: ifeq          99
      43: aload_1
      44: invokeinterface #210,  1          // InterfaceMethod java/util/Iterator.next:()Ljava/lang/Object;
      49: checkcast     #131                // class ryey/easer/core/a/k
      52: astore_2
      53: aload_2
      54: invokevirtual #238                // Method ryey/easer/core/a/k.j:()Z
      57: ifeq          34
      60: aload_0
      61: getfield      #119                // Field a:Landroid/content/Context;
      64: aload_2
      65: aload_0
      66: getfield      #123                // Field c:Ljava/util/concurrent/ExecutorService;
      69: aload_0
      70: getfield      #125                // Field d:Lryey/easer/core/ConditionHolderService$a;
      73: aload_0
      74: getfield      #127                // Field e:Lryey/easer/core/a$a;
      77: invokestatic  #240                // Method a:(Landroid/content/Context;Lryey/easer/core/a/k;Ljava/util/concurrent/ExecutorService;Lryey/easer/core/ConditionHolderService$a;Lryey/easer/core/a$a;)Lryey/easer/core/d;
      80: astore_2
      81: aload_0
      82: getfield      #39                 // Field f:Ljava/util/List;
      85: aload_2
      86: invokeinterface #244,  2          // InterfaceMethod java/util/List.add:(Ljava/lang/Object;)Z
      91: pop
      92: aload_2
      93: invokevirtual #246                // Method e:()V
      96: goto          34
      99: aload_0
     100: monitorexit
     101: return
     102: astore_1
     103: aload_0
     104: monitorexit
     105: aload_1
     106: athrow
    Exception table:
       from    to  target type
           2    34   102   any
          34    96   102   any
}
