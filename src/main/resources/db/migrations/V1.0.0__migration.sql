CREATE TABLE "users" (
  "id" SERIAL PRIMARY KEY,
  "firstName" varchar,
  "lastName" varchar,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "bankAccounts" (
  "id" SERIAL PRIMARY KEY,
  "userId" uuid,
  "bankId" uuid,
  "iban" varchar,
  "balance" float,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "banks" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "logoLink" varchar,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "watchLists" (
  "id" SERIAL PRIMARY KEY,
  "userId" uuid,
  "name" varchar,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "watchListItem" (
  "id" SERIAL PRIMARY KEY,
  "watchListId" uuid,
  "listedCompanyId" uuid,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "company" (
  "id" SERIAL PRIMARY KEY,
  "name" varchar,
  "logoLink" varchar,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "listedCompany" (
  "id" SERIAL PRIMARY KEY,
  "companyId" uuid,
  "abbreviaton" varchar,
  "stockMarket" varchar,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "payment" (
  "id" SERIAL PRIMARY KEY,
  "bankAccountId" uuid,
  "amount" float,
  "counterpartyName" varchar,
  "counterpartyIban" varchar,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "savingsGoalPayment" (
  "id" SERIAL PRIMARY KEY,
  "bankAccountId" uuid,
  "savingsGoalId" uuid,
  "createdAt" timestamp,
  "updatedAt" timestamp
);

CREATE TABLE "savingsGoal" (
  "id" SERIAL PRIMARY KEY,
  "bankAccountId" uuid,
  "name" varchar,
  "goal" varchar,
  "progress" float,
  "createdAt" timestamp,
  "updatedAt" timestamp
);
