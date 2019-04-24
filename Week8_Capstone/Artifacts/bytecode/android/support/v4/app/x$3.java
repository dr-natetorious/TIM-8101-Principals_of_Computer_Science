class android.support.v4.app.x$3 implements java.lang.Runnable {
  final java.util.ArrayList a;

  final java.util.Map b;

  final android.support.v4.app.x c;

  android.support.v4.app.x$3(android.support.v4.app.x, java.util.ArrayList, java.util.Map);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #20                 // Field c:Landroid/support/v4/app/x;
       5: aload_0
       6: aload_2
       7: putfield      #22                 // Field a:Ljava/util/ArrayList;
      10: aload_0
      11: aload_3
      12: putfield      #24                 // Field b:Ljava/util/Map;
      15: aload_0
      16: invokespecial #27                 // Method java/lang/Object."<init>":()V
      19: return

  public void run();
    Code:
       0: aload_0
       1: getfield      #22                 // Field a:Ljava/util/ArrayList;
       4: invokevirtual #35                 // Method java/util/ArrayList.size:()I
       7: istore_2
       8: iconst_0
       9: istore_1
      10: iload_1
      11: iload_2
      12: if_icmpge     58
      15: aload_0
      16: getfield      #22                 // Field a:Ljava/util/ArrayList;
      19: iload_1
      20: invokevirtual #39                 // Method java/util/ArrayList.get:(I)Ljava/lang/Object;
      23: checkcast     #41                 // class android/view/View
      26: astore_3
      27: aload_3
      28: invokestatic  #47                 // Method android/support/v4/view/s.m:(Landroid/view/View;)Ljava/lang/String;
      31: astore        4
      33: aload_3
      34: aload_0
      35: getfield      #24                 // Field b:Ljava/util/Map;
      38: aload         4
      40: invokeinterface #52,  2           // InterfaceMethod java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
      45: checkcast     #54                 // class java/lang/String
      48: invokestatic  #57                 // Method android/support/v4/view/s.a:(Landroid/view/View;Ljava/lang/String;)V
      51: iload_1
      52: iconst_1
      53: iadd
      54: istore_1
      55: goto          10
      58: return
}
