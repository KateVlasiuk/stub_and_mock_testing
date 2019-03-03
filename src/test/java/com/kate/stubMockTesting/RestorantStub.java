package com.kate.stubMockTesting;

public class RestorantStub extends Restorant {
    @Override
    public int[] capacity() {
        return new int[]{42,43};
    }
}
