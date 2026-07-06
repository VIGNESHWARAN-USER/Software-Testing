import { faker } from '@faker-js/faker';
import { User } from '../types/User';

export class UserFactory {

    static createUser(overrides: Partial<User> = {}): User {

        return {
            firstName: faker.person.firstName(),
            lastName: faker.person.lastName(),
            email: `user_${faker.string.uuid()}@gmail.com`,
            phone: faker.string.numeric(10),
            password: "Password@123",
            ...overrides
        };

    }
}