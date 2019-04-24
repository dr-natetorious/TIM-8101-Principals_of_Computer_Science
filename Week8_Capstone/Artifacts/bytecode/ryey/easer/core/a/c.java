public class ryey.easer.core.a.c implements ryey.easer.core.a.f,ryey.easer.core.a.l,ryey.easer.core.a.m {
  public ryey.easer.core.a.c(int, java.lang.String, ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: invokespecial #21                 // Method java/lang/Object."<init>":()V
       4: aload_0
       5: iload_1
       6: putfield      #23                 // Field a:I
       9: aload_0
      10: aload_2
      11: putfield      #25                 // Field b:Ljava/lang/String;
      14: aload_0
      15: aload_3
      16: putfield      #27                 // Field c:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      19: return

  public static ryey.easer.core.a.c a(ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: new           #2                  // class ryey/easer/core/a/c
       3: dup
       4: aload_0
       5: invokespecial #32                 // Method "<init>":(Lryey/easer/commons/local_plugin/eventplugin/EventData;)V
       8: areturn

  public java.lang.String a();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/String;
       4: areturn

  public void b(ryey.easer.commons.local_plugin.eventplugin.EventData);
    Code:
       0: aload_0
       1: aload_1
       2: putfield      #27                 // Field c:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       5: return

  public boolean b();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/String;
       4: ifnull        19
       7: aload_0
       8: getfield      #25                 // Field b:Ljava/lang/String;
      11: invokevirtual #39                 // Method java/lang/String.isEmpty:()Z
      14: ifeq          19
      17: iconst_0
      18: ireturn
      19: aload_0
      20: getfield      #27                 // Field c:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      23: ifnull        42
      26: aload_0
      27: getfield      #27                 // Field c:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      30: invokeinterface #43,  1           // InterfaceMethod ryey/easer/commons/local_plugin/eventplugin/EventData.a:()Z
      35: ifne          40
      38: iconst_0
      39: ireturn
      40: iconst_1
      41: ireturn
      42: iconst_0
      43: ireturn

  public ryey.easer.commons.local_plugin.eventplugin.EventData c();
    Code:
       0: aload_0
       1: getfield      #27                 // Field c:Lryey/easer/commons/local_plugin/eventplugin/EventData;
       4: areturn

  public int d();
    Code:
       0: aload_0
       1: getfield      #23                 // Field a:I
       4: ireturn

  public boolean e();
    Code:
       0: aload_0
       1: getfield      #25                 // Field b:Ljava/lang/String;
       4: ifnonnull     9
       7: iconst_1
       8: ireturn
       9: iconst_0
      10: ireturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: ifnull        54
       4: aload_1
       5: instanceof    #2                  // class ryey/easer/core/a/c
       8: ifne          13
      11: iconst_0
      12: ireturn
      13: aload_0
      14: getfield      #25                 // Field b:Ljava/lang/String;
      17: astore_2
      18: aload_1
      19: checkcast     #2                  // class ryey/easer/core/a/c
      22: astore_1
      23: aload_2
      24: aload_1
      25: getfield      #25                 // Field b:Ljava/lang/String;
      28: invokestatic  #54                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      31: ifne          36
      34: iconst_0
      35: ireturn
      36: aload_0
      37: getfield      #27                 // Field c:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      40: aload_1
      41: getfield      #27                 // Field c:Lryey/easer/commons/local_plugin/eventplugin/EventData;
      44: invokestatic  #54                 // Method ryey/easer/b.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
      47: ifne          52
      50: iconst_0
      51: ireturn
      52: iconst_1
      53: ireturn
      54: iconst_0
      55: ireturn
}
