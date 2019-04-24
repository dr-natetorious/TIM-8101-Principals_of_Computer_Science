final class com.google.common.base.Ticker$1 extends com.google.common.base.Ticker {
  com.google.common.base.Ticker$1();
    Code:
       0: aload_0
       1: invokespecial #8                  // Method com/google/common/base/Ticker."<init>":()V
       4: return

  public long read();
    Code:
       0: invokestatic  #16                 // Method com/google/common/base/Platform.systemNanoTime:()J
       3: lreturn
}
