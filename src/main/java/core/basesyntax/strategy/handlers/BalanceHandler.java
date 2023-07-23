package core.basesyntax.strategy.handlers;

import core.basesyntax.db.Storage;

public class BalanceHandler implements OperationHandler {
    @Override
    public void doOperation(String fruit, int numbers) {
        Storage.storageMap.put(fruit, numbers);
    }
}
